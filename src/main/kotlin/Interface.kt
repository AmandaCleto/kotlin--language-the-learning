//OOP - Fundamentals - polymorphism

//Interfaces cannot be instantiated, but can be implemented, when a class implements
//an interface, it must override its methods
//A class can implement multiple interfaces, different from inherit

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