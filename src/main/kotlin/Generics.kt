class Generics {
    open class ClassGeneric<T>( variable: T) {
        var v = variable
        fun whatIsTheT(): Unit {
           when (v) {
               is Boolean -> println("It\'s Boolean")
               is Int -> println("It\'s Int")
               is Long -> println("It\'s Long")
               is Float -> println("It\'s Float")
               is Boolean -> println("It\'s Boolean")
               is String -> println("It\'s String")
               else -> println("Other")
           }
        }
    }
    fun <T> printElementType(element: T) {
        when (element) {
            is Boolean -> println("It\'s Boolean")
            is Int -> println("It\'s Int")
            is Long -> println("It\'s Long")
            is Float -> println("It\'s Float")
            is Boolean -> println("It\'s Boolean")
            is String -> println("It\'s String")
            else -> println("Other")
        }
    }
    fun bookLibraryUsingInOut() {
        val library = Library()
        val book = library.get() //out
        library.process(book) //in
    }


    //reified allows you to access the type in execution time
    inline fun <reified T> printTypeReified() {
        println(T::class.simpleName)
    }
    fun iceCreamInOut() {
        //the idea here is to populate app delivery
        //with ice cream selling stores
        var appDelivery = AppDelivery()

        //here we create an ice cream store called sofiaIceCreams
        var sofiaIceCreams = SofiaIceCreams<ChocolateIceCream>()

        //here we create an ice cream store called sofiaIceCreams
        var blinkIceCreamsGrape = BlinkIceCreams<GrapeIceCream>()
        var blinkIceCreamsChocolate = BlinkIceCreams<ChocolateIceCream>()

        //when we try to use sellSofiaStore, we cannot pass sofiaIceCreams to it
        //because the function expects an exact SofiaIceCreams<IceCream> NOT subclasses
//        appDelivery.sellSofiaStore(sofiaIceCreams)

        //as we used 'out' in BlinkIceCreams, we can pass any covariant of
        // BlinkIceCreams<IceCream>, any subclass of IceCream
        appDelivery.sellBlinkStore(blinkIceCreamsGrape)
        appDelivery.sellBlinkStore(blinkIceCreamsChocolate)

    }
}


// usage of in and out
interface Covariant<out T> {
    //out can return a type of T
    fun get(): T
}
interface Contravariant<in T> {
    //in cannot return a type as T
    fun process(item: T)
}
class Book(val title: String)
class Library : Covariant<Book>, Contravariant<Book> {
    override fun get(): Book {
        return Book("Dom Casmurro")
    }

    override fun process(livro: Book) {
        println("Processando o livro: ${livro.title}")
    }
}

// usage of in
fun printElements(list: List<out String>) {
    for (element in list) {
        println(element)
    }
}


// usage of out
open class IceCream() {}
class ChocolateIceCream() : IceCream() {}
class GrapeIceCream() : IceCream() {}

//sofia ice creams only produces ice cream
class SofiaIceCreams<T: IceCream> {
    fun produce(){}
}


//blink ice creams produces ice creams and any of its subclasses
class BlinkIceCreams<out T: IceCream> {
    fun produce(){}
}

//app delivery has multiple ice creams stores, such as sofia ice cream that receives any
//type of ice cream
class AppDelivery {
    fun sellSofiaStore(sofia: SofiaIceCreams<IceCream>) {
        sofia.produce()
    }

    fun sellBlinkStore(blink: BlinkIceCreams<IceCream>) {
        blink.produce()
    }
}

// In summary, * is used as a wildcard for unknown generic types and
// does not provide specific information about the generic type, while T
// is used as an explicit generic type parameter that allows you to
// refer to specific information about the generic type in other parts
// of the function declaration.