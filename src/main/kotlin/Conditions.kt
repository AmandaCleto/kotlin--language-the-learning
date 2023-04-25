class Conditions {
    fun usageOfWhen(condition: Boolean) {
        when(condition) {
            true -> println("in when = true")
            else -> println("in when = false")
        }

        //or
        /*
            when {
                condition -> println("in when = true")
                else -> println("in when = false")
            }
         */

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
        var cond1 = if(condition) {
            println("you can use any code here")
            "returned variable if = true" //the last line will be the return
        } else {
            "returned variable else = false"
        }
        println(cond1)
    }
}