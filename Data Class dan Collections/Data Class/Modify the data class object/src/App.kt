data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("zaki", 25)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)
    println(dataUser4)
    println(dataUser5)
}