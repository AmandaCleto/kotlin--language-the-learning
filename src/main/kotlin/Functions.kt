class Functions {
    //declaration
    fun normalDeclaration() {
        println("one instruction only")
    }
    fun normalDeclaration2() = println("one instruction only")

    //named params
    fun namedParams(name: String, lastName: String) = println("$name $lastName")
    //namedParams(lastName="laila", name="cleto")


    //Overcharge of Functions:
    //functions can have the same name, if they expect different types
    fun first(message: String) = println("Passing a String=$message")
    fun first(message: Int) = println("Passing a Int=$message")


    //default values in params
    fun defaultValues(name: String = "laila") = println(name)
    //defaultValues() //works!
    //defaultValues("syndi") //works!


    //pure functions
    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    //usage of functions
    fun printResultCalculated(x: Int, y: Int, operator: (Int, Int) -> Int) {
        val result = operator(x, y)
        println("The result is equal to $result")
    }

    fun usageOfOtherFunctionsAsFilters() {
        var listOfCakes = listOf(
            Cake(true, "strawberry"),
            Cake(false, "chocolate"),
            Cake(true, "banana")
        )

        var newList = listOfCakes.filter(::filterFruitsCakes)
        newList.forEach { println(it) }

    }

    private fun filterFruitsCakes(cake: Cake): Boolean {
        return cake.isFruit
    }

    fun mergeTwoListsWithoutRepeatingIt(): Unit {
        val list1 = listOf(1, 2, 3, 15, 5, 13, 16)
        val list2 = listOf(3, 2, 2, 6, 10, 7, 4, 9)

        val result = list1.union(list2)
        result.forEachIndexed { index, element -> println("$index : $element") }
    }

    fun typesOfFor() {
        val list1 = listOf(1, 2, 3, 15, 5, 13, 16)

        //loop through all elements form list1
        for (element in list1) {
            println(element) //1, 2, 3, 15, 5, 13, 16
        }

        println("")

        //loop through all elements and indexes from list1
        for (index in list1.indices) {
            println("index: $index element: ${list1[index]}")
//            index: 0 element: 1
//            index: 1 element: 2
//            index: 2 element: 3
//            index: 3 element: 15
//            index: 4 element: 5
//            index: 5 element: 13
//            index: 6 element: 16
        }

        println("")

        //loop through 0 to 3 -> range control
        for (index in 0..3) {
            println("index: $index") //0, 1, 2, 3
        }

        println("")

        //loop through 0 until 3 -> range control
        for (index in 0 until 3) {
            println("index: $index") //0, 1, 2
        }

        println("")

        //loop through 0 until 10 jumping 2 by 2
        for (index in 0 until 10 step 2) {
            println("index: $index") //0, 2, 4, 6, 8
        }

        println("")

        //loop through 5 until 0 -> reverse
        for (index in 5 downTo  0) {
            println("index: $index") //5, 4, 3, 2, 1, 0
        }
    }

    //there is also the while loop, classic as other languages
//    while(i < 10) {
//        i++
//        println(i)
//    }
}

data class Cake(var isFruit: Boolean, var name: String)