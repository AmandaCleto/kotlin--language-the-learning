class Collections {
    // SETS -> don't have repetitive values,
    // by using classes as objects, they'll all be different because of their reference
    // by using data classes, then, it will differ by checking each content, not references
    fun executeSets() {
        var users = setOf("water", "milk", "soda", "water")
        users.forEach { println(it) }
    }

    // FIXED COLLECTIONS
    fun executeFixed() {
        //ARRAY
//        val arrayOfIntegersFixed = intArrayOf(1,2,3,4)
//        val arrayOfBooleanFixed = booleanArrayOf(true, false, true, false)
//        etc

        val arrayOfAnimalsFixed = arrayOf(
            ObjectAnimal("Bob", "monkey"),
            ObjectAnimal("Lola", "giraffe")
        )

        //accessing all values
        arrayOfAnimalsFixed.forEach { println(it) }

        //accessing a specific value
        println(arrayOfAnimalsFixed[0])


        //LIST
        var arrayOfAnimalsDynamic = listOf(
            ObjectAnimal("Bob", "monkey"),
            ObjectAnimal("Lola", "giraffe")
        )

        arrayOfAnimalsDynamic.forEach { println(it) }

        //accessing the first value, if you not sure that there is a value, use firstOrNull
        println(arrayOfAnimalsDynamic.first().name)

        //accessing the last value
        println(arrayOfAnimalsDynamic.last().name)


        //Difference from ListOf and ArrayOf
        //== means: has the same length and content
        val l1 = listOf("a")
        val l2 = listOf("a")
        var x = (l1 == l2) // => true
        println(x)

        //== means: equals in references
        val a1 = arrayOf("a")
        val a2 = arrayOf("a")
        var y = (a1 == a2) // => false
        println(y)
    }


    // DYNAMIC COLLECTIONS
    fun executeDynamic() {
        //Mutable Lists
        //works as a stack
        var listOfAnimalsMutable = mutableListOf<ObjectAnimal>(
            ObjectAnimal("Syndi", "Dog"),
            ObjectAnimal("Lila", "Cat"),
        )

        println("List mutable")
        println(listOfAnimalsMutable.first().name)
        println("Changing first element's name")
        listOfAnimalsMutable.first().name = "Laila"
        println(listOfAnimalsMutable.first().name)

        //update (add, remove)
    }


    // COMBINATION OF LISTS
    fun combinationOfLists() {
        //update list A (mutable) to add in yourself values from list b
        //that contains 'a'
        val a = mutableListOf("amanda", "jonas")
        val b = listOf("caio", "ingrid")

        b.filterTo(a, {it.contains("a")})
        println(a)

        //create a new list with the combination of two lists
        val c = listOf('1', '2')
        val d = listOf('3', '4')
        val e = listOf(c, d)
        println(e) // [['1', '2'],['3', '4']]
        println(e.flatten()) //['1','2','3','4']
    }


    // FILTERS
    fun filteringLists() {
        var f = mutableListOf("what", "about", "all", "the", "things")
        val filtered = f.filter { //there is filterNot too
            f -> f.lowercase().contains("h")
        }
        filtered.forEach { println(it) }

        val filteredObject = f.firstOrNull {it == "we"}
        println(filteredObject)
    }
}

class ObjectAnimal(var name: String, var type: String) {}