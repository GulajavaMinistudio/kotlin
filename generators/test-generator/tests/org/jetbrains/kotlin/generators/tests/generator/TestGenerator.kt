/*
 * Copyright 2000-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.generators.tests.generator

import org.jetbrains.kotlin.generators.util.GeneratorsFileUtil
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners
import org.jetbrains.kotlin.test.KotlinTestUtils
import org.jetbrains.kotlin.test.TargetBackend
import org.jetbrains.kotlin.test.TestMetadata
import org.jetbrains.kotlin.utils.Printer
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.BlockJUnit4ClassRunner
import java.io.File
import java.io.IOException
import java.util.*

class TestGenerator(
    baseDir: String,
    suiteTestClassFqName: String,
    baseTestClassFqName: String,
    testClassModels: Collection<TestClassModel>,
    useJunit4: Boolean
) {
    private val baseTestClassPackage: String
    private val suiteClassPackage: String
    private val suiteClassName: String
    private val baseTestClassName: String
    private val testClassModels: Collection<TestClassModel>
    private val useJunit4: Boolean
    private val testSourceFilePath: String

    init {
        this.baseTestClassPackage = baseTestClassFqName.substringBeforeLast('.', "")
        this.baseTestClassName = baseTestClassFqName.substringAfterLast('.', baseTestClassFqName)
        this.suiteClassPackage = suiteTestClassFqName.substringBeforeLast('.', baseTestClassPackage)
        this.suiteClassName = suiteTestClassFqName.substringAfterLast('.', suiteTestClassFqName)
        this.testClassModels = ArrayList(testClassModels)
        this.useJunit4 = useJunit4

        this.testSourceFilePath = baseDir + "/" + this.suiteClassPackage.replace(".", "/") + "/" + this.suiteClassName + ".java"

        if (!GENERATED_FILES.add(testSourceFilePath)) {
            throw IllegalArgumentException("Same test file already generated in current session: " + testSourceFilePath)
        }
    }

    @Throws(IOException::class)
    fun generateAndSave() {
        val out = StringBuilder()
        val p = Printer(out)

        val year = GregorianCalendar()[Calendar.YEAR]
        p.println(
            """/*
            | * Copyright 2010-$year JetBrains s.r.o. and Kotlin Programming Language contributors.
            | * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
            | */
            |""".trimMargin()
        )
        p.println("package ", suiteClassPackage, ";")
        p.println()
        p.println("import com.intellij.testFramework.TestDataPath;")
        if (!useJunit4) {
            p.println("import ", RUNNER.canonicalName, ";")
        }
        p.println("import " + KotlinTestUtils::class.java.canonicalName + ";")

        for (clazz in testClassModels.flatMapTo(mutableSetOf()) { classModel -> classModel.imports }) {
            p.println("import ${clazz.name};")
        }

        if (suiteClassPackage != baseTestClassPackage) {
            p.println("import $baseTestClassPackage.$baseTestClassName;")
        }

        p.println("import " + TestMetadata::class.java.canonicalName + ";")
        p.println("import " + RunWith::class.java.canonicalName + ";")
        if (useJunit4) {
            p.println("import " + BlockJUnit4ClassRunner::class.java.canonicalName + ";")
            p.println("import " + Test::class.java.canonicalName + ";")
        }
        p.println()
        p.println("import java.io.File;")
        p.println("import java.util.regex.Pattern;")
        p.println()
        p.println("/** This class is generated by {@link ", KotlinTestUtils.TEST_GENERATOR_NAME, "}. DO NOT MODIFY MANUALLY */")

        generateSuppressAllWarnings(p)

        val model: TestClassModel
        if (testClassModels.size == 1) {
            model = object : DelegatingTestClassModel(testClassModels.single()) {
                override val name: String
                    get() = suiteClassName
            }
        } else {
            model = object : TestClassModel() {
                override val innerTestClasses: Collection<TestClassModel>
                    get() = testClassModels

                override val methods: Collection<MethodModel>
                    get() = emptyList()

                override val isEmpty: Boolean
                    get() = false

                override val name: String
                    get() = suiteClassName

                override val dataString: String?
                    get() = null

                override val dataPathRoot: String?
                    get() = null

                override val annotations: Collection<AnnotationModel>
                    get() = emptyList()

                override val imports: Set<Class<*>>
                    get() = super.imports
            }
        }

        generateTestClass(p, model, false)

        val testSourceFile = File(testSourceFilePath)
        GeneratorsFileUtil.writeFileIfContentChanged(testSourceFile, out.toString(), false)
    }

    private fun generateTestClass(p: Printer, testClassModel: TestClassModel, isStatic: Boolean) {
        val staticModifier = if (isStatic) "static " else ""

        generateMetadata(p, testClassModel)
        generateTestDataPath(p, testClassModel)
        generateParameterAnnotations(p, testClassModel)

        p.println("@RunWith(", if (useJunit4) JUNIT4_RUNNER.simpleName else RUNNER.simpleName, ".class)")

        p.println("public " + staticModifier + "class ", testClassModel.name, " extends ", baseTestClassName, " {")
        p.pushIndent()

        val testMethods = testClassModel.methods
        val innerTestClasses = testClassModel.innerTestClasses

        var first = true

        for (methodModel in testMethods) {
            if (!methodModel.shouldBeGenerated()) continue

            if (first) {
                first = false
            } else {
                p.println()
            }

            generateTestMethod(p, methodModel, useJunit4)
        }

        for (innerTestClass in innerTestClasses) {
            if (!innerTestClass.isEmpty) {
                if (first) {
                    first = false
                } else {
                    p.println()
                }

                generateTestClass(p, innerTestClass, true)
            }
        }

        p.popIndent()
        p.println("}")
    }

    companion object {
        private val GENERATED_FILES = HashSet<String>()
        private val RUNNER = JUnit3RunnerWithInners::class.java
        private val JUNIT4_RUNNER = BlockJUnit4ClassRunner::class.java

        private fun generateTestMethod(p: Printer, methodModel: MethodModel, useJunit4: Boolean) {
            if (useJunit4 && (methodModel !is RunTestMethodModel)) {
                p.println("@Test")
            }
            generateMetadata(p, methodModel)

            methodModel.generateSignature(p)
            p.printWithNoIndent(" {")
            p.println()

            p.pushIndent()

            methodModel.generateBody(p)

            p.popIndent()
            p.println("}")
        }

        private fun generateMetadata(p: Printer, testDataSource: TestEntityModel) {
            val dataString = testDataSource.dataString
            if (dataString != null) {
                p.println("@TestMetadata(\"", dataString, "\")")
            }
        }

        private fun generateTestDataPath(p: Printer, testClassModel: TestClassModel) {
            val dataPathRoot = testClassModel.dataPathRoot
            if (dataPathRoot != null) {
                p.println("@TestDataPath(\"", dataPathRoot, "\")")
            }
        }

        private fun generateParameterAnnotations(p: Printer, testClassModel: TestClassModel) {
            for (annotationModel in testClassModel.annotations) {
                annotationModel.generate(p);
                p.println()
            }
        }

        private fun generateSuppressAllWarnings(p: Printer) {
            p.println("@SuppressWarnings(\"all\")")
        }
    }
}
