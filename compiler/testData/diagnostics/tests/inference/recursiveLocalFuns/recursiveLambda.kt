// !WITH_NEW_INFERENCE
fun foo() {
    fun bar() = {
        <!TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!DEBUG_INFO_MISSING_UNRESOLVED!>bar<!>()<!>
    }
}