interface Printer {
    fun print(text: String)
}

class PrinterDefault : Printer {
    override fun print(text: String) {
        println("Printing: $text")
    }
}

//the implementation of Printer will be delegated to printer (received on the constructor)
class PrinterWithHeader(private val printer: Printer) : Printer by printer {
    fun printWithHeader(text: String) {
        println("Header")
        printer.print(text)
    }
}