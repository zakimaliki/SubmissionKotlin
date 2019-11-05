fun main() {
    val user = mapOf<String, String>(
            "Name" to "John",
            "Age" to "23",
            "Address" to "St. Petersburg")
    val name = user.getValue("Name")
    val age = user.getValue("Age")
    val address = user.getValue("Address")
    println("User\nName: $name")
    println("Age: $age")
    println("Address: $address")

}