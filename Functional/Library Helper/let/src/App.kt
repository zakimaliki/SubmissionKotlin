fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
}