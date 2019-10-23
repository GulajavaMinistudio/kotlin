/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/resolve/testData/resolve/stdlib")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirResolveTestCaseWithStdlibGenerated extends AbstractFirResolveTestCaseWithStdlib {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInStdlib() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/resolve/testData/resolve/stdlib"), Pattern.compile("^([^.]+)\\.kt$"), true);
    }

    @TestMetadata("arrayFirstOrNull.kt")
    public void testArrayFirstOrNull() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/arrayFirstOrNull.kt");
    }

    @TestMetadata("backingField.kt")
    public void testBackingField() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/backingField.kt");
    }

    @TestMetadata("companionLoad.kt")
    public void testCompanionLoad() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/companionLoad.kt");
    }

    @TestMetadata("components.kt")
    public void testComponents() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/components.kt");
    }

    @TestMetadata("concurrent.kt")
    public void testConcurrent() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/concurrent.kt");
    }

    @TestMetadata("exception.kt")
    public void testException() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/exception.kt");
    }

    @TestMetadata("factoryFunctionOverloads.kt")
    public void testFactoryFunctionOverloads() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/factoryFunctionOverloads.kt");
    }

    @TestMetadata("functionX.kt")
    public void testFunctionX() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/functionX.kt");
    }

    @TestMetadata("hashSet.kt")
    public void testHashSet() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/hashSet.kt");
    }

    @TestMetadata("helloWorld.kt")
    public void testHelloWorld() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/helloWorld.kt");
    }

    @TestMetadata("implicitReceiverOrder.kt")
    public void testImplicitReceiverOrder() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/implicitReceiverOrder.kt");
    }

    @TestMetadata("mapList.kt")
    public void testMapList() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/mapList.kt");
    }

    @TestMetadata("multipleImplicitReceivers.kt")
    public void testMultipleImplicitReceivers() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/multipleImplicitReceivers.kt");
    }

    @TestMetadata("problems.kt")
    public void testProblems() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/problems.kt");
    }

    @TestMetadata("recursiveBug.kt")
    public void testRecursiveBug() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/recursiveBug.kt");
    }

    @TestMetadata("reflectionClass.kt")
    public void testReflectionClass() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/reflectionClass.kt");
    }

    @TestMetadata("simpleDelegateProvider.kt")
    public void testSimpleDelegateProvider() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/simpleDelegateProvider.kt");
    }

    @TestMetadata("simpleDelegatedToMap.kt")
    public void testSimpleDelegatedToMap() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/simpleDelegatedToMap.kt");
    }

    @TestMetadata("simpleLazy.kt")
    public void testSimpleLazy() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/simpleLazy.kt");
    }

    @TestMetadata("topLevelResolve.kt")
    public void testTopLevelResolve() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/topLevelResolve.kt");
    }

    @TestMetadata("typeAliasDeserialization.kt")
    public void testTypeAliasDeserialization() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/typeAliasDeserialization.kt");
    }

    @TestMetadata("typeParameterDerived.kt")
    public void testTypeParameterDerived() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/typeParameterDerived.kt");
    }

    @TestMetadata("unaryOperators.kt")
    public void testUnaryOperators() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/unaryOperators.kt");
    }
}
