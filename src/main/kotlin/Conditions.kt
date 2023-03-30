class Conditions {
    fun usageOfWhen( condition: Boolean) {
        when(condition) {
            true -> println("in when = true")
            else -> println("in when = false")
        }

        //set variable with when
        var cond2 = when {condition -> "returned variable when = true" else -> "return variable when = false"}
        println(cond2)
    }

    fun usageOfIfElse(condition: Boolean) {
        if(condition) {
            println("in if / else = true")
        } else {
            println("in if / else = false")
        }

        //set variable with if / else
        var cond1 = if(condition) { "returned variable if = true" } else { "returned variable else = false" }
        println(cond1)
    }
}