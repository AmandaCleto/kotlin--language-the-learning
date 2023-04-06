//Internal: class only visible to this module
internal class Stringing(val numberOfStrings: Int)

open class Instrument(var color: String) {
    private lateinit var stringing: Stringing

    fun printInstrument() = println("my instrument has color of: $color, with" +
            " ${stringing.numberOfStrings} strings")

    //as Stringing is not visible to its children, create a function to set stringing via inherit children
    fun addStringsNumber(numberOfStrings: Int) {
        stringing = Stringing(numberOfStrings)
    }
}

class Guitar(color: String) : Instrument(color) {
    init {
        addStringsNumber(5)
    }
}