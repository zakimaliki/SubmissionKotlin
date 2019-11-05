fun main() {
    val text = "Kotlin".getFirstAndLast()
    val firstChar = text["first"]
    val lastChar = text["last"]
    println(text)
}

fun String.getFirstAndLast() = mapOf<String, Char>("first" to this[0],"last" to this[this.length - 1])