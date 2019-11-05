fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)
    println(stringResult)
}
fun <T> getResult(args: T): Int {
    val x: Any
    if (args is Int)
        x = args * 5
    else if (args is String)
        x = args.length
    else
        x = 0
    return x
}