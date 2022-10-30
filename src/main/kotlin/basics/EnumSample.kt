package basics

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}
class EnumSample {
    fun getMnemonic(color: Color) = // Returns when expressed directly
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            else -> {"Nothing"}
        }
}

fun main() {
    var enumSample = EnumSample();
    var mnemonic = enumSample.getMnemonic(Color.YELLOW)
    println("Mnemonic : $mnemonic")
    mnemonic = enumSample.getMnemonic(Color.GREEN)
    println("Mnemonic : $mnemonic")

}