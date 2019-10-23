/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test.handlers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-completion/testData/handlers/smart")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SmartCompletionHandlerTestGenerated extends AbstractSmartCompletionHandlerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("AfterAs.kt")
    public void testAfterAs() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AfterAs.kt");
    }

    @TestMetadata("AfterAs2.kt")
    public void testAfterAs2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AfterAs2.kt");
    }

    @TestMetadata("AfterAs3.kt")
    public void testAfterAs3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AfterAs3.kt");
    }

    @TestMetadata("AfterSafeAs.kt")
    public void testAfterSafeAs() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AfterSafeAs.kt");
    }

    @TestMetadata("AfterVararg.kt")
    public void testAfterVararg() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AfterVararg.kt");
    }

    public void testAllFilesPresentInSmart() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/handlers/smart"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("AnonymousObject1.kt")
    public void testAnonymousObject1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AnonymousObject1.kt");
    }

    @TestMetadata("AnonymousObject2.kt")
    public void testAnonymousObject2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AnonymousObject2.kt");
    }

    @TestMetadata("AnonymousObject3.kt")
    public void testAnonymousObject3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AnonymousObject3.kt");
    }

    @TestMetadata("AnonymousObjectInsertsImport.kt")
    public void testAnonymousObjectInsertsImport() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AnonymousObjectInsertsImport.kt");
    }

    @TestMetadata("AnonymousObjectUninferredTypeArgs.kt")
    public void testAnonymousObjectUninferredTypeArgs() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AnonymousObjectUninferredTypeArgs.kt");
    }

    @TestMetadata("ArrayClassLiteral.kt")
    public void testArrayClassLiteral() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ArrayClassLiteral.kt");
    }

    @TestMetadata("AutoCompleteAfterAs1.kt")
    public void testAutoCompleteAfterAs1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AutoCompleteAfterAs1.kt");
    }

    @TestMetadata("AutoCompleteAfterAs2.kt")
    public void testAutoCompleteAfterAs2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AutoCompleteAfterAs2.kt");
    }

    @TestMetadata("AutoCompleteAfterAs3.kt")
    public void testAutoCompleteAfterAs3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/AutoCompleteAfterAs3.kt");
    }

    @TestMetadata("CallableReference1.kt")
    public void testCallableReference1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/CallableReference1.kt");
    }

    @TestMetadata("CallableReference2.kt")
    public void testCallableReference2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/CallableReference2.kt");
    }

    @TestMetadata("CallableReference3.kt")
    public void testCallableReference3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/CallableReference3.kt");
    }

    @TestMetadata("CallableReference4.kt")
    public void testCallableReference4() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/CallableReference4.kt");
    }

    @TestMetadata("ClassInClassObject.kt")
    public void testClassInClassObject() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClassInClassObject.kt");
    }

    @TestMetadata("ClassInObject.kt")
    public void testClassInObject() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClassInObject.kt");
    }

    @TestMetadata("ClassNameFromKotlinWithPackageConflict.kt")
    public void testClassNameFromKotlinWithPackageConflict() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClassNameFromKotlinWithPackageConflict.kt");
    }

    @TestMetadata("ClassObjectFieldKeywordName.kt")
    public void testClassObjectFieldKeywordName() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClassObjectFieldKeywordName.kt");
    }

    @TestMetadata("ClassObjectMethod1.kt")
    public void testClassObjectMethod1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClassObjectMethod1.kt");
    }

    @TestMetadata("ClassObjectMethod2.kt")
    public void testClassObjectMethod2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClassObjectMethod2.kt");
    }

    @TestMetadata("ClassObjectMethod3.kt")
    public void testClassObjectMethod3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClassObjectMethod3.kt");
    }

    @TestMetadata("ClassObjectMethod4.kt")
    public void testClassObjectMethod4() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClassObjectMethod4.kt");
    }

    @TestMetadata("ClosingParenthesis1.kt")
    public void testClosingParenthesis1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClosingParenthesis1.kt");
    }

    @TestMetadata("ClosingParenthesis2.kt")
    public void testClosingParenthesis2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ClosingParenthesis2.kt");
    }

    @TestMetadata("Comma1.kt")
    public void testComma1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma1.kt");
    }

    @TestMetadata("Comma10.kt")
    public void testComma10() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma10.kt");
    }

    @TestMetadata("Comma11.kt")
    public void testComma11() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma11.kt");
    }

    @TestMetadata("Comma2.kt")
    public void testComma2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma2.kt");
    }

    @TestMetadata("Comma3.kt")
    public void testComma3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma3.kt");
    }

    @TestMetadata("Comma4.kt")
    public void testComma4() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma4.kt");
    }

    @TestMetadata("Comma5.kt")
    public void testComma5() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma5.kt");
    }

    @TestMetadata("Comma6.kt")
    public void testComma6() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma6.kt");
    }

    @TestMetadata("Comma7.kt")
    public void testComma7() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma7.kt");
    }

    @TestMetadata("Comma8.kt")
    public void testComma8() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma8.kt");
    }

    @TestMetadata("Comma9.kt")
    public void testComma9() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Comma9.kt");
    }

    @TestMetadata("CommaInSuperConstructorCall.kt")
    public void testCommaInSuperConstructorCall() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/CommaInSuperConstructorCall.kt");
    }

    @TestMetadata("ConcreteJavaClass.kt")
    public void testConcreteJavaClass() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConcreteJavaClass.kt");
    }

    @TestMetadata("ConcreteJavaClass2.kt")
    public void testConcreteJavaClass2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConcreteJavaClass2.kt");
    }

    @TestMetadata("ConcreteKClass.kt")
    public void testConcreteKClass() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConcreteKClass.kt");
    }

    @TestMetadata("Constructor.kt")
    public void testConstructor() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Constructor.kt");
    }

    @TestMetadata("ConstructorForGenericType.kt")
    public void testConstructorForGenericType() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorForGenericType.kt");
    }

    @TestMetadata("ConstructorForGenericType2.kt")
    public void testConstructorForGenericType2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorForGenericType2.kt");
    }

    @TestMetadata("ConstructorForJavaClass.kt")
    public void testConstructorForJavaClass() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorForJavaClass.kt");
    }

    @TestMetadata("ConstructorForNullable.kt")
    public void testConstructorForNullable() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorForNullable.kt");
    }

    @TestMetadata("ConstructorInsertsImport.kt")
    public void testConstructorInsertsImport() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorInsertsImport.kt");
    }

    @TestMetadata("ConstructorInsertsImport2.kt")
    public void testConstructorInsertsImport2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorInsertsImport2.kt");
    }

    @TestMetadata("ConstructorWithKeywordName.kt")
    public void testConstructorWithKeywordName() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorWithKeywordName.kt");
    }

    @TestMetadata("ConstructorWithLambdaParameter1.kt")
    public void testConstructorWithLambdaParameter1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorWithLambdaParameter1.kt");
    }

    @TestMetadata("ConstructorWithLambdaParameter2.kt")
    public void testConstructorWithLambdaParameter2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorWithLambdaParameter2.kt");
    }

    @TestMetadata("ConstructorWithParameters.kt")
    public void testConstructorWithParameters() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ConstructorWithParameters.kt");
    }

    @TestMetadata("DefaultParams.kt")
    public void testDefaultParams() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/DefaultParams.kt");
    }

    @TestMetadata("DoNotEraseBraceOnTab.kt")
    public void testDoNotEraseBraceOnTab() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/DoNotEraseBraceOnTab.kt");
    }

    @TestMetadata("DoNotInsertTypeArguments.kt")
    public void testDoNotInsertTypeArguments() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/DoNotInsertTypeArguments.kt");
    }

    @TestMetadata("DoNotReplaceOnEnter.kt")
    public void testDoNotReplaceOnEnter() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/DoNotReplaceOnEnter.kt");
    }

    @TestMetadata("EnumMember.kt")
    public void testEnumMember() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/EnumMember.kt");
    }

    @TestMetadata("ExclChar.kt")
    public void testExclChar() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ExclChar.kt");
    }

    @TestMetadata("ExtensionFunctionTypeVariable1.kt")
    public void testExtensionFunctionTypeVariable1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ExtensionFunctionTypeVariable1.kt");
    }

    @TestMetadata("ExtensionFunctionTypeVariable2.kt")
    public void testExtensionFunctionTypeVariable2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ExtensionFunctionTypeVariable2.kt");
    }

    @TestMetadata("ForLoopRange.kt")
    public void testForLoopRange() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ForLoopRange.kt");
    }

    @TestMetadata("ForLoopRange2.kt")
    public void testForLoopRange2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ForLoopRange2.kt");
    }

    @TestMetadata("FunctionLiteralParamAlreadyExist.kt")
    public void testFunctionLiteralParamAlreadyExist() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/FunctionLiteralParamAlreadyExist.kt");
    }

    @TestMetadata("GenericFunction.kt")
    public void testGenericFunction() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/GenericFunction.kt");
    }

    @TestMetadata("GetWithBrackets.kt")
    public void testGetWithBrackets() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/GetWithBrackets.kt");
    }

    @TestMetadata("IfCondition.kt")
    public void testIfCondition() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/IfCondition.kt");
    }

    @TestMetadata("IfValue1.kt")
    public void testIfValue1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/IfValue1.kt");
    }

    @TestMetadata("IfValue2.kt")
    public void testIfValue2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/IfValue2.kt");
    }

    @TestMetadata("IfValue3.kt")
    public void testIfValue3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/IfValue3.kt");
    }

    @TestMetadata("IfValueInBlock.kt")
    public void testIfValueInBlock() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/IfValueInBlock.kt");
    }

    @TestMetadata("InElvisOperator.kt")
    public void testInElvisOperator() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/InElvisOperator.kt");
    }

    @TestMetadata("InnerClassInstantiation1.kt")
    public void testInnerClassInstantiation1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/InnerClassInstantiation1.kt");
    }

    @TestMetadata("InnerClassInstantiation2.kt")
    public void testInnerClassInstantiation2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/InnerClassInstantiation2.kt");
    }

    @TestMetadata("InsertTypeArguments.kt")
    public void testInsertTypeArguments() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/InsertTypeArguments.kt");
    }

    @TestMetadata("JavaEnumMemberInsertsImport.kt")
    public void testJavaEnumMemberInsertsImport() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/JavaEnumMemberInsertsImport.kt");
    }

    @TestMetadata("JavaStaticField.kt")
    public void testJavaStaticField() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/JavaStaticField.kt");
    }

    @TestMetadata("JavaStaticFieldInsertImport.kt")
    public void testJavaStaticFieldInsertImport() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/JavaStaticFieldInsertImport.kt");
    }

    @TestMetadata("JavaStaticMethod.kt")
    public void testJavaStaticMethod() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/JavaStaticMethod.kt");
    }

    @TestMetadata("JavaStaticMethod2.kt")
    public void testJavaStaticMethod2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/JavaStaticMethod2.kt");
    }

    @TestMetadata("JavaStaticMethodInsertsImport.kt")
    public void testJavaStaticMethodInsertsImport() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/JavaStaticMethodInsertsImport.kt");
    }

    @TestMetadata("kt10602.kt")
    public void testKt10602() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/kt10602.kt");
    }

    @TestMetadata("kt6179filterTo.kt")
    public void testKt6179filterTo() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/kt6179filterTo.kt");
    }

    @TestMetadata("LambdaValue1.kt")
    public void testLambdaValue1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/LambdaValue1.kt");
    }

    @TestMetadata("LambdaValue2.kt")
    public void testLambdaValue2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/LambdaValue2.kt");
    }

    @TestMetadata("LastNonOptionalParamIsFunction.kt")
    public void testLastNonOptionalParamIsFunction() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/LastNonOptionalParamIsFunction.kt");
    }

    @TestMetadata("LastParamIsFunction.kt")
    public void testLastParamIsFunction() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/LastParamIsFunction.kt");
    }

    @TestMetadata("MergeTail1.kt")
    public void testMergeTail1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/MergeTail1.kt");
    }

    @TestMetadata("MergeTail2.kt")
    public void testMergeTail2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/MergeTail2.kt");
    }

    @TestMetadata("MergeTail3.kt")
    public void testMergeTail3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/MergeTail3.kt");
    }

    @TestMetadata("MergeTail4.kt")
    public void testMergeTail4() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/MergeTail4.kt");
    }

    @TestMetadata("MultipleArgsIntoBrackets.kt")
    public void testMultipleArgsIntoBrackets() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/MultipleArgsIntoBrackets.kt");
    }

    @TestMetadata("MultipleArgsItem.kt")
    public void testMultipleArgsItem() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/MultipleArgsItem.kt");
    }

    @TestMetadata("MultipleArgsItemByTab.kt")
    public void testMultipleArgsItemByTab() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/MultipleArgsItemByTab.kt");
    }

    @TestMetadata("NamedArgument1.kt")
    public void testNamedArgument1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NamedArgument1.kt");
    }

    @TestMetadata("NamedArgument2.kt")
    public void testNamedArgument2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NamedArgument2.kt");
    }

    @TestMetadata("NamedArgument3.kt")
    public void testNamedArgument3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NamedArgument3.kt");
    }

    @TestMetadata("NamedArgumentVararg1.kt")
    public void testNamedArgumentVararg1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NamedArgumentVararg1.kt");
    }

    @TestMetadata("NamedArgumentVararg2.kt")
    public void testNamedArgumentVararg2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NamedArgumentVararg2.kt");
    }

    @TestMetadata("NamedArgumentVararg3.kt")
    public void testNamedArgumentVararg3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NamedArgumentVararg3.kt");
    }

    @TestMetadata("NamedBooleanArgument.kt")
    public void testNamedBooleanArgument() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NamedBooleanArgument.kt");
    }

    @TestMetadata("NestedDataClass.kt")
    public void testNestedDataClass() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NestedDataClass.kt");
    }

    @TestMetadata("NestedDataClassComma.kt")
    public void testNestedDataClassComma() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NestedDataClassComma.kt");
    }

    @TestMetadata("NullableValue1.kt")
    public void testNullableValue1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NullableValue1.kt");
    }

    @TestMetadata("NullableValue2.kt")
    public void testNullableValue2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NullableValue2.kt");
    }

    @TestMetadata("NullableValue3.kt")
    public void testNullableValue3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NullableValue3.kt");
    }

    @TestMetadata("NullableValueKeepOldArguments.kt")
    public void testNullableValueKeepOldArguments() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/NullableValueKeepOldArguments.kt");
    }

    @TestMetadata("ObjectFromType.kt")
    public void testObjectFromType() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ObjectFromType.kt");
    }

    @TestMetadata("QualifiedCallReplacementBug.kt")
    public void testQualifiedCallReplacementBug() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/QualifiedCallReplacementBug.kt");
    }

    @TestMetadata("QualifiedThisKeywordName1.kt")
    public void testQualifiedThisKeywordName1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/QualifiedThisKeywordName1.kt");
    }

    @TestMetadata("QualifiedThisKeywordName2.kt")
    public void testQualifiedThisKeywordName2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/QualifiedThisKeywordName2.kt");
    }

    @TestMetadata("ReplaceArgument.kt")
    public void testReplaceArgument() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/ReplaceArgument.kt");
    }

    @TestMetadata("SAMExpected1.kt")
    public void testSAMExpected1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/SAMExpected1.kt");
    }

    @TestMetadata("SAMExpected2.kt")
    public void testSAMExpected2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/SAMExpected2.kt");
    }

    @TestMetadata("SecondVararg.kt")
    public void testSecondVararg() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/SecondVararg.kt");
    }

    @TestMetadata("SetWithBrackets.kt")
    public void testSetWithBrackets() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/SetWithBrackets.kt");
    }

    @TestMetadata("TabReplaceComma1.kt")
    public void testTabReplaceComma1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceComma1.kt");
    }

    @TestMetadata("TabReplaceComma2.kt")
    public void testTabReplaceComma2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceComma2.kt");
    }

    @TestMetadata("TabReplaceExpression.kt")
    public void testTabReplaceExpression() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceExpression.kt");
    }

    @TestMetadata("TabReplaceExpression2.kt")
    public void testTabReplaceExpression2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceExpression2.kt");
    }

    @TestMetadata("TabReplaceExpression3.kt")
    public void testTabReplaceExpression3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceExpression3.kt");
    }

    @TestMetadata("TabReplaceExpression4.kt")
    public void testTabReplaceExpression4() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceExpression4.kt");
    }

    @TestMetadata("TabReplaceFunctionName1.kt")
    public void testTabReplaceFunctionName1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceFunctionName1.kt");
    }

    @TestMetadata("TabReplaceFunctionName2.kt")
    public void testTabReplaceFunctionName2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceFunctionName2.kt");
    }

    @TestMetadata("TabReplaceFunctionName3.kt")
    public void testTabReplaceFunctionName3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceFunctionName3.kt");
    }

    @TestMetadata("TabReplaceIdentifier.kt")
    public void testTabReplaceIdentifier() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceIdentifier.kt");
    }

    @TestMetadata("TabReplaceOperand.kt")
    public void testTabReplaceOperand() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TabReplaceOperand.kt");
    }

    @TestMetadata("True.kt")
    public void testTrue() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/True.kt");
    }

    @TestMetadata("True2.kt")
    public void testTrue2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/True2.kt");
    }

    @TestMetadata("TypeParameterAfterAs.kt")
    public void testTypeParameterAfterAs() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/TypeParameterAfterAs.kt");
    }

    @TestMetadata("Vararg1.kt")
    public void testVararg1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Vararg1.kt");
    }

    @TestMetadata("Vararg2.kt")
    public void testVararg2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Vararg2.kt");
    }

    @TestMetadata("Vararg3.kt")
    public void testVararg3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Vararg3.kt");
    }

    @TestMetadata("Vararg4.kt")
    public void testVararg4() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Vararg4.kt");
    }

    @TestMetadata("Vararg5.kt")
    public void testVararg5() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Vararg5.kt");
    }

    @TestMetadata("Vararg6.kt")
    public void testVararg6() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/Vararg6.kt");
    }

    @TestMetadata("VarargAfterStar.kt")
    public void testVarargAfterStar() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/VarargAfterStar.kt");
    }

    @TestMetadata("VarargWithParameterAfter.kt")
    public void testVarargWithParameterAfter() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/VarargWithParameterAfter.kt");
    }

    @TestMetadata("WhenElse.kt")
    public void testWhenElse() throws Exception {
        runTest("idea/idea-completion/testData/handlers/smart/WhenElse.kt");
    }

    @TestMetadata("idea/idea-completion/testData/handlers/smart/lambda")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Lambda extends AbstractSmartCompletionHandlerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("1.kt")
        public void test1() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambda/1.kt");
        }

        @TestMetadata("2.kt")
        public void test2() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambda/2.kt");
        }

        @TestMetadata("3.kt")
        public void test3() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambda/3.kt");
        }

        @TestMetadata("4.kt")
        public void test4() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambda/4.kt");
        }

        @TestMetadata("5.kt")
        public void test5() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambda/5.kt");
        }

        public void testAllFilesPresentInLambda() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/handlers/smart/lambda"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("InsertImport.kt")
        public void testInsertImport() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambda/InsertImport.kt");
        }

        @TestMetadata("ParameterNamesSpecified.kt")
        public void testParameterNamesSpecified() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambda/ParameterNamesSpecified.kt");
        }

        @TestMetadata("ParameterNamesSpecified_NullableType.kt")
        public void testParameterNamesSpecified_NullableType() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambda/ParameterNamesSpecified_NullableType.kt");
        }
    }

    @TestMetadata("idea/idea-completion/testData/handlers/smart/lambdaSignature")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class LambdaSignature extends AbstractSmartCompletionHandlerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInLambdaSignature() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/handlers/smart/lambdaSignature"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("NoAdditionalSpace.kt")
        public void testNoAdditionalSpace() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambdaSignature/NoAdditionalSpace.kt");
        }

        @TestMetadata("Simple.kt")
        public void testSimple() throws Exception {
            runTest("idea/idea-completion/testData/handlers/smart/lambdaSignature/Simple.kt");
        }
    }
}
