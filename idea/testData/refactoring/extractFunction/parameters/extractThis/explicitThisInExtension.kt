// PARAM_TYPES: Z
// PARAM_DESCRIPTOR: public fun Z.foo(): kotlin.Int defined in root package in file explicitThisInExtension.kt
class Z(val a: Int)

// SIBLING:
fun Z.foo(): Int {
    return <selection>this.a</selection> + 1
}
