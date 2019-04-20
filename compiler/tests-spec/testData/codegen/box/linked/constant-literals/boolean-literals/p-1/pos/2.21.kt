/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACE: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 21
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the catchBlock.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

annotation class A

fun box(): String? {
    var value_1 = false
    var value_2 = true

    try {
        throw Exception()
    } catch (`true`: Throwable) {
        value_1 = true
    }

    try {
        throw Exception()
    } catch (@A `false`: Throwable) {
        value_2 = false
    }

    if (!value_1 || value_2) return null

    return "OK"
}