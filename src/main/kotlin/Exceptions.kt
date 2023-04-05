import java.lang.ArithmeticException
import java.lang.IllegalArgumentException

class Exceptions {
    //types of casts
    fun casts() {
        val result = returnAny(2)
        if (result is String) {
            println("It's a String, and it has ${result.length} as length")
        }

        //runtime exception!
        //when the real object is not String, it cannot be cast as String
//        val castAsString  = result as String
//        println(castAsString.length)


        //check if it is nullable before casting it
        //nullable?
        val castAsStringOrNullable = result as? String
        if (castAsStringOrNullable != null) {
            println("It's a String, and it has ${castAsStringOrNullable.length} as length")
        }
    }

    fun exceptions() {
        divide(10, 0)
        showDiscount()
    }

    //use try/catch to handle exceptions
    //Exception is the highest class that only lost to Throwable
    private fun divide(x: Int, y: Int): Unit {
        try {
            println(x / y)
        } catch (e: ArithmeticException) {
            println("cannot divide x by 0")
        }
    }

    //Any is the father of all objects, can be anything, and any object inherits from him
    private fun returnAny(index: Int): Any {
        return when (index) {
            1 -> 1
            2 -> '2'
            3 -> true
            else -> 3.0
        }
    }


    private fun showDiscount() {
        try {
            val valueDiscounted = addDiscount(100.0, 51.0)
            println(valueDiscounted)
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }

    //usage of throws
    private fun addDiscount(price: Double, discount: Double): Double {
        if (discount > 50.0) {
            throw IllegalArgumentException("too high discount!")
        }

        val discounted = price * discount / 100
        return price - discounted
    }
}