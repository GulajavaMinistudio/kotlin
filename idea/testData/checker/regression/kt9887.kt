open class A<T>()
class G<T>()


class B : A<<error descr="[WRONG_NUMBER_OF_TYPE_ARGUMENTS] One type argument expected for class G<T> defined in root package in file kt9887.kt">G</error>>()