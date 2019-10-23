/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.visualizer.psi;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/visualizer/testData/uncommonCases/testFiles")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class PsiVisualizerForUncommonCasesGenerated extends AbstractPsiVisualizer {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doUncommonCasesTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInTestFiles() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/visualizer/testData/uncommonCases/testFiles"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("dataClass.kt")
    public void testDataClass() throws Exception {
        runTest("compiler/visualizer/testData/uncommonCases/testFiles/dataClass.kt");
    }

    @TestMetadata("delegation.kt")
    public void testDelegation() throws Exception {
        runTest("compiler/visualizer/testData/uncommonCases/testFiles/delegation.kt");
    }

    @TestMetadata("innerWith.kt")
    public void testInnerWith() throws Exception {
        runTest("compiler/visualizer/testData/uncommonCases/testFiles/innerWith.kt");
    }

    @TestMetadata("lists.kt")
    public void testLists() throws Exception {
        runTest("compiler/visualizer/testData/uncommonCases/testFiles/lists.kt");
    }

    @TestMetadata("properties.kt")
    public void testProperties() throws Exception {
        runTest("compiler/visualizer/testData/uncommonCases/testFiles/properties.kt");
    }

    @TestMetadata("receiver.kt")
    public void testReceiver() throws Exception {
        runTest("compiler/visualizer/testData/uncommonCases/testFiles/receiver.kt");
    }

    @TestMetadata("superTypes.kt")
    public void testSuperTypes() throws Exception {
        runTest("compiler/visualizer/testData/uncommonCases/testFiles/superTypes.kt");
    }

    @TestMetadata("variance.kt")
    public void testVariance() throws Exception {
        runTest("compiler/visualizer/testData/uncommonCases/testFiles/variance.kt");
    }

    @TestMetadata("where.kt")
    public void testWhere() throws Exception {
        runTest("compiler/visualizer/testData/uncommonCases/testFiles/where.kt");
    }
}
