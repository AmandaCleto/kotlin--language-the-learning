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

        b.filterTo(a, { it.contains("a") })
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
                f ->
            f.lowercase().contains("h")
        }
        filtered.forEach { println(it) }

        val filteredObject = f.firstOrNull { it == "we" }
        println(filteredObject)
    }


    // MAPS
    fun usageOfMaps() {
        //IMMUTABLE
        val products = mapOf(
            "key" to "value",
            "fanta" to "coca-cola",
            "iphone" to "apple"
        )

        //accessing second value by its key
        val fantaValue = products["fanta"]
        println(fantaValue)


        //when get a value by passing a wrong key
        //you can specify a default value to be returned, otherwise, null would be returned
        val nonexistentValue = products.getOrDefault(
            "grape", "there is no" +
                    " \"grape\" key in products list"
        )
        println(nonexistentValue)

        //when get a value by passing a wrong key
        //you can do something else and then specify a default value to be returned,
        //otherwise, null would be returned
        val nonexistentValueElse = products.getOrElse("grape") {
            println("does something...")
            "there is no \"grape\" key in products list"
        }
        println(nonexistentValueElse)


        //if contains something, does something
        val hasSomething = products.containsKey("fanta")
        if (hasSomething) {
            println("contains fanta")
        } else {
            println("does not contain fanta")
        }


        //MUTABLE - update ( delete, update )
        val products2 = mutableMapOf(
            0 to "cellphone",
            1 to "notebook",
            2 to "computer"
        )

        products2[0] = "smartphone"
        println(products2.values)

        products2.remove(0)
        println(products2.values)

        products2[3] = "new product"
        println(products2.values)
    }
}

data class ObjectAnimal(var name: String, var type: String) {}