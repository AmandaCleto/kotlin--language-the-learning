//OOP - Fundamentals

//to make a class open to be inherited, it must be prefixed with "open"
open class Person(var name: String, var age: Int) { //super class

    //private variables: only seen by this super class
    private val isRational: Boolean = true

    //protect variables: only accessed by inherited classes
    protected var hasVisionLack: Boolean = false

    fun printDescription() = println("My name is: $name, and my age is $age, I'm ${if(isRational) "" else "not "}" +
            "rational and I ${if(hasVisionLack) "don't " else ""}use glasses.")
}

class Professor(name: String, age: Int, var classSubject: String, var wearGlasses: Boolean) : Person(name, age){
    init {
        hasVisionLack = wearGlasses
    }
    fun printClassSubject() = println("I teach $classSubject class")
}