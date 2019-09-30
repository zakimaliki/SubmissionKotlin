fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println(text)

}

// TODO 1
fun String.getFirstAndLast() = mapOf<String, Char>("first" to this[0],"last" to this[this.length - 1])