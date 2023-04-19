//Extension functions allow you to add functions to an existing class without having to access its source code.
class Extensions {
//    private fun String.hasSpaces(): Boolean {
//        val found = this.find { it == ' ' }
//        return found != null
//    }


    //String.name => means extension from String
   private fun String.hasSpaces() = find { it == ' ' } != null

    fun execute() {
        println("Does it have spaces?".hasSpaces())
    }
}