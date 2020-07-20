/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/typescript-export")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class LegacyJsTypeScriptExportTestGenerated extends AbstractLegacyJsTypeScriptExportTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
    }

    public void testAllFilesPresentInTypescript_export() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
    }

    @TestMetadata("js/js.translator/testData/typescript-export/constructors")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Constructors extends AbstractLegacyJsTypeScriptExportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInConstructors() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/constructors"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
        }
    }

    @TestMetadata("js/js.translator/testData/typescript-export/declarations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Declarations extends AbstractLegacyJsTypeScriptExportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInDeclarations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/declarations"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
        }

        @TestMetadata("declarations.kt")
        public void testDeclarations() throws Exception {
            runTest("js/js.translator/testData/typescript-export/declarations/declarations.kt");
        }
    }

    @TestMetadata("js/js.translator/testData/typescript-export/inheritance")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Inheritance extends AbstractLegacyJsTypeScriptExportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInInheritance() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/inheritance"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
        }

        @TestMetadata("inheritance.kt")
        public void testInheritance() throws Exception {
            runTest("js/js.translator/testData/typescript-export/inheritance/inheritance.kt");
        }
    }

    @TestMetadata("js/js.translator/testData/typescript-export/moduleSystems")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ModuleSystems extends AbstractLegacyJsTypeScriptExportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInModuleSystems() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/moduleSystems"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
        }

        @TestMetadata("commonjs.kt")
        public void testCommonjs() throws Exception {
            runTest("js/js.translator/testData/typescript-export/moduleSystems/commonjs.kt");
        }

        @TestMetadata("plain.kt")
        public void testPlain() throws Exception {
            runTest("js/js.translator/testData/typescript-export/moduleSystems/plain.kt");
        }

        @TestMetadata("umd.kt")
        public void testUmd() throws Exception {
            runTest("js/js.translator/testData/typescript-export/moduleSystems/umd.kt");
        }
    }

    @TestMetadata("js/js.translator/testData/typescript-export/namespaces")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Namespaces extends AbstractLegacyJsTypeScriptExportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInNamespaces() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/namespaces"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
        }

        @TestMetadata("namespaces.kt")
        public void testNamespaces() throws Exception {
            runTest("js/js.translator/testData/typescript-export/namespaces/namespaces.kt");
        }
    }

    @TestMetadata("js/js.translator/testData/typescript-export/primitives")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Primitives extends AbstractLegacyJsTypeScriptExportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInPrimitives() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/primitives"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
        }

        @TestMetadata("primitives.kt")
        public void testPrimitives() throws Exception {
            runTest("js/js.translator/testData/typescript-export/primitives/primitives.kt");
        }
    }

    @TestMetadata("js/js.translator/testData/typescript-export/selectiveExport")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SelectiveExport extends AbstractLegacyJsTypeScriptExportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInSelectiveExport() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/selectiveExport"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
        }

        @TestMetadata("selectiveExport.kt")
        public void testSelectiveExport() throws Exception {
            runTest("js/js.translator/testData/typescript-export/selectiveExport/selectiveExport.kt");
        }
    }

    @TestMetadata("js/js.translator/testData/typescript-export/visibility")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Visibility extends AbstractLegacyJsTypeScriptExportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInVisibility() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/visibility"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
        }

        @TestMetadata("visibility.kt")
        public void testVisibility() throws Exception {
            runTest("js/js.translator/testData/typescript-export/visibility/visibility.kt");
        }
    }
}
