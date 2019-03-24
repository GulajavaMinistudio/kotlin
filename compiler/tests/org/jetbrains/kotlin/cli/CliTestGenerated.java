/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.cli;

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
@RunWith(JUnit3RunnerWithInners.class)
public class CliTestGenerated extends AbstractCliTest {
    @TestMetadata("compiler/testData/cli/jvm")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jvm extends AbstractCliTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doJvmTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInJvm() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cli/jvm"), Pattern.compile("^(.+)\\.args$"), TargetBackend.ANY, false);
        }

        @TestMetadata("apiVersion.args")
        public void testApiVersion() throws Exception {
            runTest("compiler/testData/cli/jvm/apiVersion.args");
        }

        @TestMetadata("apiVersion1.0.args")
        public void testApiVersion1_0() throws Exception {
            runTest("compiler/testData/cli/jvm/apiVersion1.0.args");
        }

        @TestMetadata("apiVersionAndSinceNewerKotlin.args")
        public void testApiVersionAndSinceNewerKotlin() throws Exception {
            runTest("compiler/testData/cli/jvm/apiVersionAndSinceNewerKotlin.args");
        }

        @TestMetadata("apiVersionGreaterThanLanguage.args")
        public void testApiVersionGreaterThanLanguage() throws Exception {
            runTest("compiler/testData/cli/jvm/apiVersionGreaterThanLanguage.args");
        }

        @TestMetadata("apiVersionInvalid.args")
        public void testApiVersionInvalid() throws Exception {
            runTest("compiler/testData/cli/jvm/apiVersionInvalid.args");
        }

        @TestMetadata("apiVersionLessThanLanguage.args")
        public void testApiVersionLessThanLanguage() throws Exception {
            runTest("compiler/testData/cli/jvm/apiVersionLessThanLanguage.args");
        }

        @TestMetadata("apiVersionLessThanLanguageUsingArgfile.args")
        public void testApiVersionLessThanLanguageUsingArgfile() throws Exception {
            runTest("compiler/testData/cli/jvm/apiVersionLessThanLanguageUsingArgfile.args");
        }

        @TestMetadata("argfileWithEmptyArgument.args")
        public void testArgfileWithEmptyArgument() throws Exception {
            runTest("compiler/testData/cli/jvm/argfileWithEmptyArgument.args");
        }

        @TestMetadata("argfileWithEscaping.args")
        public void testArgfileWithEscaping() throws Exception {
            runTest("compiler/testData/cli/jvm/argfileWithEscaping.args");
        }

        @TestMetadata("argfileWithUnfinishedQuoteAndEscape.args")
        public void testArgfileWithUnfinishedQuoteAndEscape() throws Exception {
            runTest("compiler/testData/cli/jvm/argfileWithUnfinishedQuoteAndEscape.args");
        }

        @TestMetadata("argumentPassedMultipleTimes.args")
        public void testArgumentPassedMultipleTimes() throws Exception {
            runTest("compiler/testData/cli/jvm/argumentPassedMultipleTimes.args");
        }

        @TestMetadata("classAndFileClassClash.args")
        public void testClassAndFileClassClash() throws Exception {
            runTest("compiler/testData/cli/jvm/classAndFileClassClash.args");
        }

        @TestMetadata("classAndOtherFileClassClash.args")
        public void testClassAndOtherFileClassClash() throws Exception {
            runTest("compiler/testData/cli/jvm/classAndOtherFileClassClash.args");
        }

        @TestMetadata("classAndPartClash.args")
        public void testClassAndPartClash() throws Exception {
            runTest("compiler/testData/cli/jvm/classAndPartClash.args");
        }

        @TestMetadata("classAndTraitClash.args")
        public void testClassAndTraitClash() throws Exception {
            runTest("compiler/testData/cli/jvm/classAndTraitClash.args");
        }

        @TestMetadata("classpath.args")
        public void testClasspath() throws Exception {
            runTest("compiler/testData/cli/jvm/classpath.args");
        }

        @TestMetadata("compatqualDefault.args")
        public void testCompatqualDefault() throws Exception {
            runTest("compiler/testData/cli/jvm/compatqualDefault.args");
        }

        @TestMetadata("compatqualDisable.args")
        public void testCompatqualDisable() throws Exception {
            runTest("compiler/testData/cli/jvm/compatqualDisable.args");
        }

        @TestMetadata("compatqualEnable.args")
        public void testCompatqualEnable() throws Exception {
            runTest("compiler/testData/cli/jvm/compatqualEnable.args");
        }

        @TestMetadata("compatqualWrong.args")
        public void testCompatqualWrong() throws Exception {
            runTest("compiler/testData/cli/jvm/compatqualWrong.args");
        }

        @TestMetadata("conflictingOverloads.args")
        public void testConflictingOverloads() throws Exception {
            runTest("compiler/testData/cli/jvm/conflictingOverloads.args");
        }

        @TestMetadata("coroutinesEnable.args")
        public void testCoroutinesEnable() throws Exception {
            runTest("compiler/testData/cli/jvm/coroutinesEnable.args");
        }

        @TestMetadata("coroutinesError.args")
        public void testCoroutinesError() throws Exception {
            runTest("compiler/testData/cli/jvm/coroutinesError.args");
        }

        @TestMetadata("coroutinesErrorAndEnable.args")
        public void testCoroutinesErrorAndEnable() throws Exception {
            runTest("compiler/testData/cli/jvm/coroutinesErrorAndEnable.args");
        }

        @TestMetadata("coroutinesWarn.args")
        public void testCoroutinesWarn() throws Exception {
            runTest("compiler/testData/cli/jvm/coroutinesWarn.args");
        }

        @TestMetadata("deprecatedApiVersion.args")
        public void testDeprecatedApiVersion() throws Exception {
            runTest("compiler/testData/cli/jvm/deprecatedApiVersion.args");
        }

        @TestMetadata("deprecatedLanguageVersion.args")
        public void testDeprecatedLanguageVersion() throws Exception {
            runTest("compiler/testData/cli/jvm/deprecatedLanguageVersion.args");
        }

        @TestMetadata("diagnosticsOrder.args")
        public void testDiagnosticsOrder() throws Exception {
            runTest("compiler/testData/cli/jvm/diagnosticsOrder.args");
        }

        @TestMetadata("duplicateSources.args")
        public void testDuplicateSources() throws Exception {
            runTest("compiler/testData/cli/jvm/duplicateSources.args");
        }

        @TestMetadata("duplicateSourcesInModule.args")
        public void testDuplicateSourcesInModule() throws Exception {
            runTest("compiler/testData/cli/jvm/duplicateSourcesInModule.args");
        }

        @TestMetadata("emptySources.args")
        public void testEmptySources() throws Exception {
            runTest("compiler/testData/cli/jvm/emptySources.args");
        }

        @TestMetadata("experimentalAndUseExperimentalWithSameAnnotation.args")
        public void testExperimentalAndUseExperimentalWithSameAnnotation() throws Exception {
            runTest("compiler/testData/cli/jvm/experimentalAndUseExperimentalWithSameAnnotation.args");
        }

        @TestMetadata("experimentalDeprecated.args")
        public void testExperimentalDeprecated() throws Exception {
            runTest("compiler/testData/cli/jvm/experimentalDeprecated.args");
        }

        @TestMetadata("experimentalDeprecatedWarning.args")
        public void testExperimentalDeprecatedWarning() throws Exception {
            runTest("compiler/testData/cli/jvm/experimentalDeprecatedWarning.args");
        }

        @TestMetadata("experimentalIsNotAnnotation.args")
        public void testExperimentalIsNotAnnotation() throws Exception {
            runTest("compiler/testData/cli/jvm/experimentalIsNotAnnotation.args");
        }

        @TestMetadata("experimentalIsNotMarker.args")
        public void testExperimentalIsNotMarker() throws Exception {
            runTest("compiler/testData/cli/jvm/experimentalIsNotMarker.args");
        }

        @TestMetadata("experimentalNested.args")
        public void testExperimentalNested() throws Exception {
            runTest("compiler/testData/cli/jvm/experimentalNested.args");
        }

        @TestMetadata("experimentalUnresolved.args")
        public void testExperimentalUnresolved() throws Exception {
            runTest("compiler/testData/cli/jvm/experimentalUnresolved.args");
        }

        @TestMetadata("explicitlyDisableSamConversionsWithOldFlag.args")
        public void testExplicitlyDisableSamConversionsWithOldFlag() throws Exception {
            runTest("compiler/testData/cli/jvm/explicitlyDisableSamConversionsWithOldFlag.args");
        }

        @TestMetadata("explicitlyDisabledSamConversions.args")
        public void testExplicitlyDisabledSamConversions() throws Exception {
            runTest("compiler/testData/cli/jvm/explicitlyDisabledSamConversions.args");
        }

        @TestMetadata("extraArgumentPassedInObsoleteForm.args")
        public void testExtraArgumentPassedInObsoleteForm() throws Exception {
            runTest("compiler/testData/cli/jvm/extraArgumentPassedInObsoleteForm.args");
        }

        @TestMetadata("extraHelp.args")
        public void testExtraHelp() throws Exception {
            runTest("compiler/testData/cli/jvm/extraHelp.args");
        }

        @TestMetadata("fileClassAndMultifileClassClash.args")
        public void testFileClassAndMultifileClassClash() throws Exception {
            runTest("compiler/testData/cli/jvm/fileClassAndMultifileClassClash.args");
        }

        @TestMetadata("fileClassAndTImplClash.args")
        public void testFileClassAndTImplClash() throws Exception {
            runTest("compiler/testData/cli/jvm/fileClassAndTImplClash.args");
        }

        @TestMetadata("fileClassClashMultipleFiles.args")
        public void testFileClassClashMultipleFiles() throws Exception {
            runTest("compiler/testData/cli/jvm/fileClassClashMultipleFiles.args");
        }

        @TestMetadata("flagAllowingResultAsReturnType.args")
        public void testFlagAllowingResultAsReturnType() throws Exception {
            runTest("compiler/testData/cli/jvm/flagAllowingResultAsReturnType.args");
        }

        @TestMetadata("help.args")
        public void testHelp() throws Exception {
            runTest("compiler/testData/cli/jvm/help.args");
        }

        @TestMetadata("inlineCycle.args")
        public void testInlineCycle() throws Exception {
            runTest("compiler/testData/cli/jvm/inlineCycle.args");
        }

        @TestMetadata("internalArgDisableLanguageFeature.args")
        public void testInternalArgDisableLanguageFeature() throws Exception {
            runTest("compiler/testData/cli/jvm/internalArgDisableLanguageFeature.args");
        }

        @TestMetadata("internalArgEmptyFeatureName.args")
        public void testInternalArgEmptyFeatureName() throws Exception {
            runTest("compiler/testData/cli/jvm/internalArgEmptyFeatureName.args");
        }

        @TestMetadata("internalArgEnableLanguageFeature.args")
        public void testInternalArgEnableLanguageFeature() throws Exception {
            runTest("compiler/testData/cli/jvm/internalArgEnableLanguageFeature.args");
        }

        @TestMetadata("internalArgMissingModificator.args")
        public void testInternalArgMissingModificator() throws Exception {
            runTest("compiler/testData/cli/jvm/internalArgMissingModificator.args");
        }

        @TestMetadata("internalArgNoWarningForEnablingBugfix.args")
        public void testInternalArgNoWarningForEnablingBugfix() throws Exception {
            runTest("compiler/testData/cli/jvm/internalArgNoWarningForEnablingBugfix.args");
        }

        @TestMetadata("internalArgUnrecognizedFeature.args")
        public void testInternalArgUnrecognizedFeature() throws Exception {
            runTest("compiler/testData/cli/jvm/internalArgUnrecognizedFeature.args");
        }

        @TestMetadata("internalArgWrongPrefix.args")
        public void testInternalArgWrongPrefix() throws Exception {
            runTest("compiler/testData/cli/jvm/internalArgWrongPrefix.args");
        }

        @TestMetadata("internalArgumentOverrideExtraArgument.args")
        public void testInternalArgumentOverrideExtraArgument() throws Exception {
            runTest("compiler/testData/cli/jvm/internalArgumentOverrideExtraArgument.args");
        }

        @TestMetadata("invalidMetadataVersion.args")
        public void testInvalidMetadataVersion() throws Exception {
            runTest("compiler/testData/cli/jvm/invalidMetadataVersion.args");
        }

        @TestMetadata("javaSrcWrongPackage.args")
        public void testJavaSrcWrongPackage() throws Exception {
            runTest("compiler/testData/cli/jvm/javaSrcWrongPackage.args");
        }

        @TestMetadata("jdkPathDoesNotExist.args")
        public void testJdkPathDoesNotExist() throws Exception {
            runTest("compiler/testData/cli/jvm/jdkPathDoesNotExist.args");
        }

        @TestMetadata("jsr305AllIgnore.args")
        public void testJsr305AllIgnore() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305AllIgnore.args");
        }

        @TestMetadata("jsr305DefaultMigration.args")
        public void testJsr305DefaultMigration() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305DefaultMigration.args");
        }

        @TestMetadata("jsr305DeprecatedEnable.args")
        public void testJsr305DeprecatedEnable() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305DeprecatedEnable.args");
        }

        @TestMetadata("jsr305DeprecatedIgnore.args")
        public void testJsr305DeprecatedIgnore() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305DeprecatedIgnore.args");
        }

        @TestMetadata("jsr305DeprecatedWarn.args")
        public void testJsr305DeprecatedWarn() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305DeprecatedWarn.args");
        }

        @TestMetadata("jsr305FqNameIgnore.args")
        public void testJsr305FqNameIgnore() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305FqNameIgnore.args");
        }

        @TestMetadata("jsr305FqNameStrict.args")
        public void testJsr305FqNameStrict() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305FqNameStrict.args");
        }

        @TestMetadata("jsr305Ignore.args")
        public void testJsr305Ignore() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305Ignore.args");
        }

        @TestMetadata("jsr305MigrationDefault.args")
        public void testJsr305MigrationDefault() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305MigrationDefault.args");
        }

        @TestMetadata("jsr305MigrationFqNameIgnore.args")
        public void testJsr305MigrationFqNameIgnore() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305MigrationFqNameIgnore.args");
        }

        @TestMetadata("jsr305MigrationIgnore.args")
        public void testJsr305MigrationIgnore() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305MigrationIgnore.args");
        }

        @TestMetadata("jsr305MigrationWarn.args")
        public void testJsr305MigrationWarn() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305MigrationWarn.args");
        }

        @TestMetadata("jsr305NoFlag.args")
        public void testJsr305NoFlag() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305NoFlag.args");
        }

        @TestMetadata("jsr305Strict.args")
        public void testJsr305Strict() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305Strict.args");
        }

        @TestMetadata("jsr305Warn.args")
        public void testJsr305Warn() throws Exception {
            runTest("compiler/testData/cli/jvm/jsr305Warn.args");
        }

        @TestMetadata("jvm8Target.args")
        public void testJvm8Target() throws Exception {
            runTest("compiler/testData/cli/jvm/jvm8Target.args");
        }

        @TestMetadata("kotlinHomeWithoutStdlib.args")
        public void testKotlinHomeWithoutStdlib() throws Exception {
            runTest("compiler/testData/cli/jvm/kotlinHomeWithoutStdlib.args");
        }

        @TestMetadata("kotlinPackage.args")
        public void testKotlinPackage() throws Exception {
            runTest("compiler/testData/cli/jvm/kotlinPackage.args");
        }

        @TestMetadata("kt19628_12.args")
        public void testKt19628_12() throws Exception {
            runTest("compiler/testData/cli/jvm/kt19628_12.args");
        }

        @TestMetadata("kt19628_13.args")
        public void testKt19628_13() throws Exception {
            runTest("compiler/testData/cli/jvm/kt19628_13.args");
        }

        @TestMetadata("kt19628_progressive.args")
        public void testKt19628_progressive() throws Exception {
            runTest("compiler/testData/cli/jvm/kt19628_progressive.args");
        }

        @TestMetadata("kt22304.args")
        public void testKt22304() throws Exception {
            runTest("compiler/testData/cli/jvm/kt22304.args");
        }

        @TestMetadata("languageVersion.args")
        public void testLanguageVersion() throws Exception {
            runTest("compiler/testData/cli/jvm/languageVersion.args");
        }

        @TestMetadata("languageVersionInvalid.args")
        public void testLanguageVersionInvalid() throws Exception {
            runTest("compiler/testData/cli/jvm/languageVersionInvalid.args");
        }

        @TestMetadata("legacySmartCastsAfterTry.args")
        public void testLegacySmartCastsAfterTry() throws Exception {
            runTest("compiler/testData/cli/jvm/legacySmartCastsAfterTry.args");
        }

        @TestMetadata("mixingArgfilesAndUsualArgs.args")
        public void testMixingArgfilesAndUsualArgs() throws Exception {
            runTest("compiler/testData/cli/jvm/mixingArgfilesAndUsualArgs.args");
        }

        @TestMetadata("multipleTextRangesInDiagnosticsOrder.args")
        public void testMultipleTextRangesInDiagnosticsOrder() throws Exception {
            runTest("compiler/testData/cli/jvm/multipleTextRangesInDiagnosticsOrder.args");
        }

        @TestMetadata("newInferenceImpliesSamConversions.args")
        public void testNewInferenceImpliesSamConversions() throws Exception {
            runTest("compiler/testData/cli/jvm/newInferenceImpliesSamConversions.args");
        }

        @TestMetadata("newInferenceWithOldFlagImpliesSamConversions.args")
        public void testNewInferenceWithOldFlagImpliesSamConversions() throws Exception {
            runTest("compiler/testData/cli/jvm/newInferenceWithOldFlagImpliesSamConversions.args");
        }

        @TestMetadata("noReflect.args")
        public void testNoReflect() throws Exception {
            runTest("compiler/testData/cli/jvm/noReflect.args");
        }

        @TestMetadata("noStdlib.args")
        public void testNoStdlib() throws Exception {
            runTest("compiler/testData/cli/jvm/noStdlib.args");
        }

        @TestMetadata("nonExistingClassPathAndAnnotationsPath.args")
        public void testNonExistingClassPathAndAnnotationsPath() throws Exception {
            runTest("compiler/testData/cli/jvm/nonExistingClassPathAndAnnotationsPath.args");
        }

        @TestMetadata("nonExistingPhaseName.args")
        public void testNonExistingPhaseName() throws Exception {
            runTest("compiler/testData/cli/jvm/nonExistingPhaseName.args");
        }

        @TestMetadata("nonExistingSourcePath.args")
        public void testNonExistingSourcePath() throws Exception {
            runTest("compiler/testData/cli/jvm/nonExistingSourcePath.args");
        }

        @TestMetadata("nonLocalDisabled.args")
        public void testNonLocalDisabled() throws Exception {
            runTest("compiler/testData/cli/jvm/nonLocalDisabled.args");
        }

        @TestMetadata("nonexistentPathInModule.args")
        public void testNonexistentPathInModule() throws Exception {
            runTest("compiler/testData/cli/jvm/nonexistentPathInModule.args");
        }

        @TestMetadata("nonexistentScript.args")
        public void testNonexistentScript() throws Exception {
            runTest("compiler/testData/cli/jvm/nonexistentScript.args");
        }

        @TestMetadata("nonexistingArgfile.args")
        public void testNonexistingArgfile() throws Exception {
            runTest("compiler/testData/cli/jvm/nonexistingArgfile.args");
        }

        @TestMetadata("pluginSimple.args")
        public void testPluginSimple() throws Exception {
            runTest("compiler/testData/cli/jvm/pluginSimple.args");
        }

        @TestMetadata("progressiveModeOff.args")
        public void testProgressiveModeOff() throws Exception {
            runTest("compiler/testData/cli/jvm/progressiveModeOff.args");
        }

        @TestMetadata("progressiveModeOn.args")
        public void testProgressiveModeOn() throws Exception {
            runTest("compiler/testData/cli/jvm/progressiveModeOn.args");
        }

        @TestMetadata("releaseCoroutinesApiVersion1.2.args")
        public void testReleaseCoroutinesApiVersion1_2() throws Exception {
            runTest("compiler/testData/cli/jvm/releaseCoroutinesApiVersion1.2.args");
        }

        @TestMetadata("returnAsWhenKey.args")
        public void testReturnAsWhenKey() throws Exception {
            runTest("compiler/testData/cli/jvm/returnAsWhenKey.args");
        }

        @TestMetadata("sanitized-name.clash.args")
        public void testSanitized_name_clash() throws Exception {
            runTest("compiler/testData/cli/jvm/sanitized-name.clash.args");
        }

        @TestMetadata("signatureClash.args")
        public void testSignatureClash() throws Exception {
            runTest("compiler/testData/cli/jvm/signatureClash.args");
        }

        @TestMetadata("simple.args")
        public void testSimple() throws Exception {
            runTest("compiler/testData/cli/jvm/simple.args");
        }

        @TestMetadata("singleJavaFileRoots.args")
        public void testSingleJavaFileRoots() throws Exception {
            runTest("compiler/testData/cli/jvm/singleJavaFileRoots.args");
        }

        @TestMetadata("suppressAllWarningsJvm.args")
        public void testSuppressAllWarningsJvm() throws Exception {
            runTest("compiler/testData/cli/jvm/suppressAllWarningsJvm.args");
        }

        @TestMetadata("suspensionPointInMonitor.args")
        public void testSuspensionPointInMonitor() throws Exception {
            runTest("compiler/testData/cli/jvm/suspensionPointInMonitor.args");
        }

        @TestMetadata("syntheticAccessorForPropertiesSignatureClash.args")
        public void testSyntheticAccessorForPropertiesSignatureClash() throws Exception {
            runTest("compiler/testData/cli/jvm/syntheticAccessorForPropertiesSignatureClash.args");
        }

        @TestMetadata("syntheticAccessorPropertyAndFunSignatureClash.args")
        public void testSyntheticAccessorPropertyAndFunSignatureClash() throws Exception {
            runTest("compiler/testData/cli/jvm/syntheticAccessorPropertyAndFunSignatureClash.args");
        }

        @TestMetadata("syntheticAccessorSignatureClash.args")
        public void testSyntheticAccessorSignatureClash() throws Exception {
            runTest("compiler/testData/cli/jvm/syntheticAccessorSignatureClash.args");
        }

        @TestMetadata("unknownExtraFlags.args")
        public void testUnknownExtraFlags() throws Exception {
            runTest("compiler/testData/cli/jvm/unknownExtraFlags.args");
        }

        @TestMetadata("unsupportedTypeAlias.args")
        public void testUnsupportedTypeAlias() throws Exception {
            runTest("compiler/testData/cli/jvm/unsupportedTypeAlias.args");
        }

        @TestMetadata("warningJdkWithNoJdk.args")
        public void testWarningJdkWithNoJdk() throws Exception {
            runTest("compiler/testData/cli/jvm/warningJdkWithNoJdk.args");
        }

        @TestMetadata("warningsInDummy.args")
        public void testWarningsInDummy() throws Exception {
            runTest("compiler/testData/cli/jvm/warningsInDummy.args");
        }

        @TestMetadata("werror.args")
        public void testWerror() throws Exception {
            runTest("compiler/testData/cli/jvm/werror.args");
        }

        @TestMetadata("werrorWithExplicitError.args")
        public void testWerrorWithExplicitError() throws Exception {
            runTest("compiler/testData/cli/jvm/werrorWithExplicitError.args");
        }

        @TestMetadata("werrorWithNoWarn.args")
        public void testWerrorWithNoWarn() throws Exception {
            runTest("compiler/testData/cli/jvm/werrorWithNoWarn.args");
        }

        @TestMetadata("werrorWithStrongWarning.args")
        public void testWerrorWithStrongWarning() throws Exception {
            runTest("compiler/testData/cli/jvm/werrorWithStrongWarning.args");
        }

        @TestMetadata("wrongAbiVersion.args")
        public void testWrongAbiVersion() throws Exception {
            runTest("compiler/testData/cli/jvm/wrongAbiVersion.args");
        }

        @TestMetadata("wrongArgument.args")
        public void testWrongArgument() throws Exception {
            runTest("compiler/testData/cli/jvm/wrongArgument.args");
        }

        @TestMetadata("wrongJdkPath.args")
        public void testWrongJdkPath() throws Exception {
            runTest("compiler/testData/cli/jvm/wrongJdkPath.args");
        }

        @TestMetadata("wrongJvmTargetVersion.args")
        public void testWrongJvmTargetVersion() throws Exception {
            runTest("compiler/testData/cli/jvm/wrongJvmTargetVersion.args");
        }

        @TestMetadata("wrongScriptWithDirectory.args")
        public void testWrongScriptWithDirectory() throws Exception {
            runTest("compiler/testData/cli/jvm/wrongScriptWithDirectory.args");
        }

        @TestMetadata("wrongScriptWithKtSource.args")
        public void testWrongScriptWithKtSource() throws Exception {
            runTest("compiler/testData/cli/jvm/wrongScriptWithKtSource.args");
        }

        @TestMetadata("wrongScriptWithNoSource.args")
        public void testWrongScriptWithNoSource() throws Exception {
            runTest("compiler/testData/cli/jvm/wrongScriptWithNoSource.args");
        }

        @TestMetadata("wrongXjsr305.args")
        public void testWrongXjsr305() throws Exception {
            runTest("compiler/testData/cli/jvm/wrongXjsr305.args");
        }
    }

    @TestMetadata("compiler/testData/cli/js")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js extends AbstractCliTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doJsTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInJs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cli/js"), Pattern.compile("^(.+)\\.args$"), TargetBackend.ANY, false);
        }

        @TestMetadata("createMetadata.args")
        public void testCreateMetadata() throws Exception {
            runTest("compiler/testData/cli/js/createMetadata.args");
        }

        @TestMetadata("emptySources.args")
        public void testEmptySources() throws Exception {
            runTest("compiler/testData/cli/js/emptySources.args");
        }

        @TestMetadata("inlineCycle.args")
        public void testInlineCycle() throws Exception {
            runTest("compiler/testData/cli/js/inlineCycle.args");
        }

        @TestMetadata("jsExtraHelp.args")
        public void testJsExtraHelp() throws Exception {
            runTest("compiler/testData/cli/js/jsExtraHelp.args");
        }

        @TestMetadata("jsHelp.args")
        public void testJsHelp() throws Exception {
            runTest("compiler/testData/cli/js/jsHelp.args");
        }

        @TestMetadata("kotlinHomeWithoutStdlib.args")
        public void testKotlinHomeWithoutStdlib() throws Exception {
            runTest("compiler/testData/cli/js/kotlinHomeWithoutStdlib.args");
        }

        @TestMetadata("kotlinPackage.args")
        public void testKotlinPackage() throws Exception {
            runTest("compiler/testData/cli/js/kotlinPackage.args");
        }

        @TestMetadata("languageVersion.args")
        public void testLanguageVersion() throws Exception {
            runTest("compiler/testData/cli/js/languageVersion.args");
        }

        @TestMetadata("libraryDirNotFound.args")
        public void testLibraryDirNotFound() throws Exception {
            runTest("compiler/testData/cli/js/libraryDirNotFound.args");
        }

        @TestMetadata("modulesWithSameNames.args")
        public void testModulesWithSameNames() throws Exception {
            runTest("compiler/testData/cli/js/modulesWithSameNames.args");
        }

        @TestMetadata("modulesWithSameNamesAndFunc.args")
        public void testModulesWithSameNamesAndFunc() throws Exception {
            runTest("compiler/testData/cli/js/modulesWithSameNamesAndFunc.args");
        }

        @TestMetadata("nonExistingKotlinHome.args")
        public void testNonExistingKotlinHome() throws Exception {
            runTest("compiler/testData/cli/js/nonExistingKotlinHome.args");
        }

        @TestMetadata("nonExistingSourcePath.args")
        public void testNonExistingSourcePath() throws Exception {
            runTest("compiler/testData/cli/js/nonExistingSourcePath.args");
        }

        @TestMetadata("notValidLibraryDir.args")
        public void testNotValidLibraryDir() throws Exception {
            runTest("compiler/testData/cli/js/notValidLibraryDir.args");
        }

        @TestMetadata("outputIsDirectory.args")
        public void testOutputIsDirectory() throws Exception {
            runTest("compiler/testData/cli/js/outputIsDirectory.args");
        }

        @TestMetadata("outputPostfixFileNotFound.args")
        public void testOutputPostfixFileNotFound() throws Exception {
            runTest("compiler/testData/cli/js/outputPostfixFileNotFound.args");
        }

        @TestMetadata("outputPrefixFileNotFound.args")
        public void testOutputPrefixFileNotFound() throws Exception {
            runTest("compiler/testData/cli/js/outputPrefixFileNotFound.args");
        }

        @TestMetadata("simple2js.args")
        public void testSimple2js() throws Exception {
            runTest("compiler/testData/cli/js/simple2js.args");
        }

        @TestMetadata("sourceMap.args")
        public void testSourceMap() throws Exception {
            runTest("compiler/testData/cli/js/sourceMap.args");
        }

        @TestMetadata("sourceMapCharEscape.args")
        public void testSourceMapCharEscape() throws Exception {
            runTest("compiler/testData/cli/js/sourceMapCharEscape.args");
        }

        @TestMetadata("sourceMapDuplicateRelativePaths.args")
        public void testSourceMapDuplicateRelativePaths() throws Exception {
            runTest("compiler/testData/cli/js/sourceMapDuplicateRelativePaths.args");
        }

        @TestMetadata("sourceMapEmbedSources.args")
        public void testSourceMapEmbedSources() throws Exception {
            runTest("compiler/testData/cli/js/sourceMapEmbedSources.args");
        }

        @TestMetadata("sourceMapPrefix.args")
        public void testSourceMapPrefix() throws Exception {
            runTest("compiler/testData/cli/js/sourceMapPrefix.args");
        }

        @TestMetadata("sourceMapRelativeRoot.args")
        public void testSourceMapRelativeRoot() throws Exception {
            runTest("compiler/testData/cli/js/sourceMapRelativeRoot.args");
        }

        @TestMetadata("sourceMapRootAuto.args")
        public void testSourceMapRootAuto() throws Exception {
            runTest("compiler/testData/cli/js/sourceMapRootAuto.args");
        }

        @TestMetadata("sourceMapRootManual.args")
        public void testSourceMapRootManual() throws Exception {
            runTest("compiler/testData/cli/js/sourceMapRootManual.args");
        }

        @TestMetadata("sourceMapRootMissing.args")
        public void testSourceMapRootMissing() throws Exception {
            runTest("compiler/testData/cli/js/sourceMapRootMissing.args");
        }

        @TestMetadata("sourceMapRootMultiple.args")
        public void testSourceMapRootMultiple() throws Exception {
            runTest("compiler/testData/cli/js/sourceMapRootMultiple.args");
        }

        @TestMetadata("suppressAllWarningsJS.args")
        public void testSuppressAllWarningsJS() throws Exception {
            runTest("compiler/testData/cli/js/suppressAllWarningsJS.args");
        }

        @TestMetadata("withFolderAsLib.args")
        public void testWithFolderAsLib() throws Exception {
            runTest("compiler/testData/cli/js/withFolderAsLib.args");
        }

        @TestMetadata("withLib.args")
        public void testWithLib() throws Exception {
            runTest("compiler/testData/cli/js/withLib.args");
        }

        @TestMetadata("wrongAbiVersion.args")
        public void testWrongAbiVersion() throws Exception {
            runTest("compiler/testData/cli/js/wrongAbiVersion.args");
        }
    }

    @TestMetadata("compiler/testData/cli/js-dce")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js_dce extends AbstractCliTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doJsDceTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInJs_dce() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cli/js-dce"), Pattern.compile("^(.+)\\.args$"), TargetBackend.ANY, false);
        }

        @TestMetadata("dceHelp.args")
        public void testDceHelp() throws Exception {
            runTest("compiler/testData/cli/js-dce/dceHelp.args");
        }

        @TestMetadata("emptySources.args")
        public void testEmptySources() throws Exception {
            runTest("compiler/testData/cli/js-dce/emptySources.args");
        }

        @TestMetadata("includeDeclarations.args")
        public void testIncludeDeclarations() throws Exception {
            runTest("compiler/testData/cli/js-dce/includeDeclarations.args");
        }

        @TestMetadata("invalidFilename.args")
        public void testInvalidFilename() throws Exception {
            runTest("compiler/testData/cli/js-dce/invalidFilename.args");
        }

        @TestMetadata("jsExtraHelp.args")
        public void testJsExtraHelp() throws Exception {
            runTest("compiler/testData/cli/js-dce/jsExtraHelp.args");
        }

        @TestMetadata("nonExistingSourcePath.args")
        public void testNonExistingSourcePath() throws Exception {
            runTest("compiler/testData/cli/js-dce/nonExistingSourcePath.args");
        }

        @TestMetadata("notFile.args")
        public void testNotFile() throws Exception {
            runTest("compiler/testData/cli/js-dce/notFile.args");
        }

        @TestMetadata("outputIsDirectory.args")
        public void testOutputIsDirectory() throws Exception {
            runTest("compiler/testData/cli/js-dce/outputIsDirectory.args");
        }

        @TestMetadata("parseError.args")
        public void testParseError() throws Exception {
            runTest("compiler/testData/cli/js-dce/parseError.args");
        }

        @TestMetadata("printReachability.args")
        public void testPrintReachability() throws Exception {
            runTest("compiler/testData/cli/js-dce/printReachability.args");
        }

        @TestMetadata("simple.args")
        public void testSimple() throws Exception {
            runTest("compiler/testData/cli/js-dce/simple.args");
        }

        @TestMetadata("withSourceMap.args")
        public void testWithSourceMap() throws Exception {
            runTest("compiler/testData/cli/js-dce/withSourceMap.args");
        }
    }

    @TestMetadata("compiler/testData/cli/metadata")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Metadata extends AbstractCliTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doMetadataTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMetadata() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cli/metadata"), Pattern.compile("^(.+)\\.args$"), TargetBackend.ANY, false);
        }

        @TestMetadata("kotlinPackage.args")
        public void testKotlinPackage() throws Exception {
            runTest("compiler/testData/cli/metadata/kotlinPackage.args");
        }

        @TestMetadata("moduleName.args")
        public void testModuleName() throws Exception {
            runTest("compiler/testData/cli/metadata/moduleName.args");
        }
    }
}
