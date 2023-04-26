//OOP - Fundamentals - polymorphism

//Interfaces cannot be instantiated, but can be implemented, when a class implements
//an interface, it must override its methods
//A class can implement multiple interfaces, different from inherit

/* When to use abstract classes VS interfaces?
Interfaces: when you want to create a contract, an addiction behavior to a class, that must implement it;
also, you want that the class that will implement the interface became a type - the interface type.
Abstract: when you want to reuse the same methods and properties of an upper class
*/

interface Playable {
    fun play() : String
}

class Musician(val name : String) {
   lateinit var playable: Playable

   fun startToPlay() {
       println("Musician $name is playing the ${playable.play()}!")
   }
}

class Drums : Playable {
    override fun play():String {
       return "drums"
    }
}

class Violin : Playable {
    override fun play() : String{
        return "violin"
    }
}