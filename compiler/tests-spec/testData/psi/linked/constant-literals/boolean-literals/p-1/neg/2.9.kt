/*
 * KOTLIN PSI SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACE: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 9
 * DESCRIPTION: The use of Boolean literals as the identifier (without backtick) in the unescapedAnnotation.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

class A {
    @field:true
    val a: Int = ""

    @setparam:false(true)
    val b: Int = ""

    @receiver:org.jetbrains.false<A<B, C>>(true)
    val c: Int = ""

    @org.jetbrains.false
    val c: Int = ""

    @true<A<B>, C>(false, true, false)
    val c: Int = ""

    @true
    val c: Int = ""

    @false.true.false<A<B>, C>(true, false, true)
    val c: Int = ""
}
