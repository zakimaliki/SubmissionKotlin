fun main() {
    val color: Color = Color.valueOf("RED")
    print("Color is $color")
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}