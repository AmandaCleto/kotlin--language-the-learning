import BootcampKotlinGoogle4.Aquarium

fun main() {
    //LOGIC of a CLASS
//    var userA= StructureOfClass() //without need of passing arguments -> constructor 3
//    println("")
//    var userB = StructureOfClass(name = "Amanda") //constructor 2
//    println("")
//    var userC = StructureOfClass(name = "Caio", isAdmin = true) //constructor default


    //SINGLETON -> will reflect in all objects
//    var s = Singleton
//    var s2 = Singleton
//    s.name = "Ochako"
//    s.printName()
//    println("")
//    s2.printName()


    //CLASSES TYPES
    //CLASS
//    var c = TypesOfClassesImp()
//    c.printName() //instance function
//    println("")
//
//    var d = NormalClass("abc")
//    d.doesSomething()

//
//    //NESTED CLASS
//    TypesOfClassesImp.NestedClass().printName()
//    println("")
//
//    //INNER CLASS
//    c.InnerClass().printName()
//    println("")
//
//    //ENUM CLASS
//    println(Enum.ELO) //ELO
//    println("")
//    println(Enum.valueOf("visa".uppercase())) //get value of
//    println("")
//    println(EnumWithParams.VISA.labelFormatted) //get parameter passed value
//    println("")
//
//    //DATA CLASS
//    //data classes are data comparison, unlike classes, that are reference comparison
//    var dc1 = DataClass("Amanda")
//    var dc2 = DataClass(name = "Amanda")
//    var dc3 = DataClass(name = "Bruce")
//    println("Two data classes with same values are equal? ${dc1 == dc2}") //true
//    println("")
//    println("Two data classes with different values are equal? ${dc1 == dc3}") //false
//    println("")
//
//    //PAIRS CLASSES
//    dc3.usageOfPairs()
//
//    //ABSTRACT CLASSES -> POO -> GO BELOW


    //DESTRUCTION
    //to a destruct a class, the class must be a data class
//    Destruction("Bakugou", true).printParams()
//    println("")
//
//    var des = Destruction(name = "Midorya", boolean = false)
//    des.printParams()
//    println("")
//
//    //destruct must follow the declaration of params the class receives!
//    val (name, boolean) = des
//    println("Destructed name and boolean are name = $name - boolean = $boolean")
//
//    //HIDDEN FUNCTIONS
//    //component
//    println(des.component1()) //access first param
//    println(des.component2()) //access second param
//
//    //copy
//    val des2 = des.copy(name = "Aru Maito")
//    println("Copied object with different name = ${des2.name}")


    //CONDITIONS
//    Conditions().usageOfWhen(true)
//    println("")
//    Conditions().usageOfWhen(false)
//    println("")
//    Conditions().usageOfIfElse(true)
//    println("")
//    Conditions().usageOfIfElse(false)
//    println("")


    //HERITAGE
//    var p = Professor("Girafales", age = 40, classSubject = "Math", wearGlasses = false) //can not access hasVisionLack because it is protected
//    var p2 = Professor("Dumbledore", age = 40, classSubject = "D.C.A.T.", wearGlasses = true) //can not access hasVisionLack because it is protected
//    p.printDescription()
//    println("")
//    p.printClassSubject()
//    println("")
//    p2.printDescription()
//    println("")
//    p2.printClassSubject()


    //MODULE
//    var instrument = Guitar(color = "black")
//    instrument.printInstrument()
//
//    //if you want to change the number of strings, you acn access the function
//    instrument.addStringsNumber(4)
//    instrument.printInstrument()


    //ABSTRACT CLASSES
//    var c = Circle("circle")
//    c.shape()
//    println("")
//    c.build()
//    println("")
//
//    var p = Pentagon("pentagon")
//    p.build()
//    println("")
//    p.shape()
//    println("")
//    p.redefine()


    //INTERFACE
//    var m = Musician(name = "Jim Halpert")
//    m.playable = Drums() //could be any instrument that implements Playable!
//    m.startToPlay()

    //DELEGATION INTERFACE
//    var delegation = PrinterWithHeader(PrinterDefault())
//    delegation.printWithHeader("Print anything")
//    println("")
//    delegation.print("print anything")


    //COLLECTIONS
//    var array = Collections()
//    array.executeSets()
//    println("")
//    array.executeFixed()
//    println("")
//    array.executeDynamic()
//    println("")
//    array.combinationOfLists()
//    println("")
//    array.filteringLists()
//    println("")
//    array.usageOfMaps()


    //FUNCTIONS
//    var f = Functions()
//    f.printResultCalculated(3, 4, f::sum)
//    println("")
////    f.printResultCalculated(3, 4, { x, y -> x + y })
//    f.printResultCalculated(3, 4) { x, y -> x + y }
//    f.usageOfOtherFunctionsAsFilters()
//    println("")
//    f.mergeTwoListsWithoutRepeatingIt()
//    println("")
//    f.typesOfFor()


    //EXCEPTIONS
//    var e = Exceptions()
//    e.casts()
//    e.exceptions()


    //EXTENSIONS
//    var e = Extensions()
//    e.execute()


    //Generics
//    var g1 = Generics.ClassGeneric<String>("amanda")
//    g1.whatIsTheT();
//
//    var g2 = Generics.ClassGeneric<Int>(12)
//    g2.whatIsTheT();
//
//    Generics().printElementType<String>("amanda");
//
//    Generics().bookLibraryUsingInOut()


    //Types Of Variables
    println(TypesOfVariables().qtdeCharacteres)
}
