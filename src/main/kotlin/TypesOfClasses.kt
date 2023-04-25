open class Class {
    //INSIDE CLASSES, it is possible to use any of the other classes, and also some others:

    //NORMAL property: Can be accessed by its inherited classes and its instantiated class
    var aboveProperty: String = ""

    //PROTECTED property
    //Can only be used inside nested classes; Only inherited classes can modify it!
    protected var protectedVariable: String = ""

    //PRIVATE property
    //Can only be used here
    private var privateVariable: String = ""

    //COMPANION OBJECTS:
    //Used to create static properties and methods
    companion object CompanionObjects {
        var static: String = ""
    }

    //INNER CLASS
    //Inner classes have access to above classes, properties and methods
    inner class InnerClass() {
        fun innerFun() {
            println(aboveProperty + protectedVariable)
        }
    }


    //ABSTRACT FUN:
    //Can only be declared inside abstract classes [not here]
    //When created, the inherited class needs to override it and give it a behavior, that's
    //why, it can't have a body {} where is declared

//    abstract fun AbstractFun()

    //Can be used too: internal and all above key-words within functions, and also,
    //all below types of classes
}

class UsageOfInheritMethods : Class() {
    init {
        println(protectedVariable)
        println(aboveProperty)
        println(static)
    }
}


//DATA CLASS:
//Used to model a class as an object, having some functionalities as equals(), copy(), etc.
//It must have at least one param
//When two data classes are compared, their data that will be compared
data class DataClassMustHaveParam(var param: String) {}

//When you want to work with simple structure of data, like two values or three, use pair, or triple

//  key -> value
//  Pair(10, 20) --> it's also a data class (other way to write it -> 10 to 20)
//  Triple(10, 20, 30) --> it's also a data class (other way to write it -> 10 to 20 to 30)

//---------------------------------------------------------------------------------------------


//CLASS:
//Simple classes, has the possibility to have methods and properties
class SimpleClass() {}
//---------------------------------------------------------------------------------------------


//OPEN CLASS:
//Open classes can be inherited (example above file)
open class OpenClass() {}
//---------------------------------------------------------------------------------------------


//PRIVATE CLASS:
//Private classes can only be used by within the file it was created
private class PrivateClass() {}
//---------------------------------------------------------------------------------------------


//INTERNAL CLASS:
//Internal classes can only be used by within the module it was created
//Cannot be used directed by some inherited class that uses it, you should create a
//setter instead of using it directly
internal class InternalClass() {}
//---------------------------------------------------------------------------------------------


//SEALED CLASS:
//Sealed classes can be inherited only by the classes within the file it was created
sealed class SealedClass() {}
//---------------------------------------------------------------------------------------------


//ENUM CLASS:
//Enum classes is used to define a collection of constant values
enum class EnumClass() {}
//---------------------------------------------------------------------------------------------


//ABSTRACT CLASS:
//Abstract classes can not be instantiated, but can be inherited by other classes
abstract class AbstractClass() {}
//---------------------------------------------------------------------------------------------


//INTERFACES:
//Interfaces are contracts that can be implemented by other classes
interface Interface {}
//---------------------------------------------------------------------------------------------


//OBJECTS:
//Objects are singleton -> global variable that regardless of instantiation will reflect the same behavior
object SingletonObject {}


//INLINE CLASSES:
//Classes that will fulfill its constructor type in memory, instead of a normal class
//Used when you want to represent primitive values as objects, and don't want to allocate more objects in heap
inline class InlineClass(val inline: String) {}

/*
EXAMPLE:

inline class DoubleValue(val value: Double)
fun processDoubleValue(doubleValue: DoubleValue) { ... }
fun main() {
    val doubleValue = DoubleValue(3.14)
    processDoubleValue(doubleValue) // DoubleValue is represented as a Double here
}
 */