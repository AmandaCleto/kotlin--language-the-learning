class TypesOfClassesImp {
    private var defaultValue : String = "Default Value"

    fun printName() = println("Class default variable: $defaultValue")

    //nested classes: don't have access to above classes
    class NestedClass{
        fun printName() = println("Can't use outside variables such as defaultValue")
    }

    //inner classes: have access to above classes
    inner class InnerClass {
        fun printName() = println("Can use outside variables, such as defaultValue: $defaultValue")
    }
}

enum class Enum {
    VISA, MASTER, ELO
}

enum class EnumWithParams(var labelFormatted: String) {
    VISA(labelFormatted = "visa card"),
    MASTER(labelFormatted = "master card"),
}

data class DataClass(var name: String) {
    fun print() = println(name)

    fun usageOfPairs() {
        //Pairs are data classes for two params
        var coordinate = Pair(10, 30)

        var coordinate2 = 20 to 90

        println("First coordinate from Pair object: ${coordinate.first}")
        println("Second coordinate from Pair object: ${coordinate.second}")

        println("First coordinate from Pair variable: ${coordinate2.first}")
        println("Second coordinate from Pair variable: ${coordinate2.second}")
    }

    fun usageOfTriple() {
        //Pairs are data classes for two params
        var triple = Triple(10, 30, 40)

        var triple2 = 20 to 90 to 100

        println("First triple from Triple object: ${triple.first}")
        println("Second triple from Triple object: ${triple.second}")
        println("Third triple from Triple object: ${triple.second}")

        println("First triple from Triple variable: ${triple2.first}")
        println("Second triple from Triple variable: ${triple2.second}")
        println("Third triple from Triple variable: ${triple2.second}")
    }
}

//Sealed classes can only be subclassed by classes of its declaration file
sealed class TheSealedClass(private var param: String) {
    fun doesSomething() {
        println(param)
    }
}

class NormalClass(paramNormal: String) : TheSealedClass(paramNormal) {

}
