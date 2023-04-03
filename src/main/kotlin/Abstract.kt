//OOP - Fundamentals

//Abstract Classes cannot be instantiated, and it is automatically opened to be inherited
abstract class Material(var name: String) {
    abstract fun shape() : Boolean //abstract functions must be overridden by inherited children

    //To use build method the children must have been instantiated and returned true
    //this function can not be overriding by its children because it is not opened
    fun build() {
        if(shape()) {
            println("Material $name is building up")
        }
    }

    //open to be called from inherit children by overriding it, you also can use super.__()
    open fun redefine() {
        println("redefining in Material")
    }

}

//Abstract Classes that inherits from Abstract Classes do not need to override anything
abstract class MaterialWithCorners( name: String, var corners: Int) : Material(name)
class Circle(name: String) : Material(name) {
    override fun shape() : Boolean {
        println("It's shape is circular")
        return true
    }
}

class Square(name: String) : MaterialWithCorners(name, 4) {
    override fun shape() : Boolean {
        println("It's shape is square with $corners corners")
        return true
    }
}

class Pentagon(name: String) : MaterialWithCorners(name, 5) {
    override fun shape() : Boolean {
        println("It's shape is pentagon with $corners corners")
        return true
    }

    override fun redefine() {
        super.redefine() //optional
        println("Redefining in Pentagon")
    }
}