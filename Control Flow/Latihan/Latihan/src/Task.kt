fun main() {
    val listNumber = 1.rangeTo(30)
    for (number in listNumber) {
        if (number % 2 == 0) continue
        if (number > 10) break
        val result = (number + 2) * number
        println("result is $result")
    }
}