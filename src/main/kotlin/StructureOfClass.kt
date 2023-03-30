class StructureOfClass (var name: String, var isAdmin: Boolean) {
    //VARIABLES
    //private variables: Not seen by instance, only by class
    private val MAX_NUMBER = 10

    //simple variables: Seen by instance
    var countObjectMutable = 0
    val countObjectImmutable = 0

    //lateinit: [late] you need to set the variable before using it
    lateinit var lastVariableObject : String

    //companion object: [static] whatever instantiated objects will see the SAME property/behavior
    companion object {
        // const - CONSTANT in compilation run time / will never be changed - preferable
        // val - CONSTANT in execution run time
        const val MIN_NUMBER = 0  // will be called as User.MIN_NUMBER

        var countClass = 0
    }


    //LIFE CYCLE
    //init: executed after class first constructor
    init {
        println("called after first constructor")
        countObjectMutable++
        countClass++
        lastVariableObject = "late name"

        println("counter object -> mutable (changed): $countObjectMutable")
        println("counter object -> immutable: $countObjectImmutable")
        println("last variable object  -> late (initialized): $lastVariableObject")
        println("counter class  -> static (companion object): $countClass")
    }


    //constructor 2: executed after init
    constructor(name: String) : this(name, isAdmin = false) {
        println("called constructor 2")
    }

    //constructor 3: executed after above constructor
    constructor() : this("Teste", isAdmin = false) {
        println("called constructor 3")
    }
}