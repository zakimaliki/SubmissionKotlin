fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78
    val result = calculate(valueA, valueB, valueC)
    println(result)
}

fun calculate(valueA: Int, valueB: Int, valueC: Int): String {
    val result = valueA + (valueB - valueC ?: 100)
    return generateResult(result)
}

fun generateResult(result: Int) = "Result is $result"