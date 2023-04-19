class TypesOfVariables {
    val byte: Byte = 8 //8-bit  (-128 to 127)
    val short: Short = 16 //16-bit  (-32768 to 32767)
    val age: Int = 20 //32-bit  (-2147483648 to 2147483647)
    val cnpj: Long = 3213 //64-bit  (-9223372036854775807 to 9223372036854775807)

    val discount: Float = 31.90f //32-bit  (6-7)
    val price: Double = 323.232 //64-bit floating point  (15-16)

    val product: String = "iMac" //String

    val active: Boolean = true //false | true  //8-bit

    // create big numbers with divisions
    val million: Long = 1_000_000

    //concat
    val firstName: String = "Laila"
    val lastName: String = "Cleto"
    val fullName: String = firstName + " " + lastName  //{$firstName $lastName}

    //indent
    val csv = """
        Text1,
        Text2
    """.replaceIndent(";")
    /*
    ;Text1,
    ;Text2
     */

    val trimIdente = """
        Text1, 
        Text2
    """.trimIndent()


    // to accept nullable
    var nullable: String? = null

    val qtdeCharacteres = if (nullable != null) nullable?.length else 0 //0
    val qtdeCharacteres2 =  nullable?.length ?: 0 //0
}
