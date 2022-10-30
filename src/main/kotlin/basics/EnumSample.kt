package basics
import basics.Color.*

class EnumSample {
    fun getMnemonic(color: Color) = // Returns when expressed directly
        when (color) {
            RED -> "Richard"
            ORANGE -> "Of"
            YELLOW -> "York"
            else -> {"Nothing"}
        }

    /**
     *  get the warm indicator
     *  multi-line switch
     */
    fun getWarmth(color: Color) =
        when (color) {
            RED, ORANGE, YELLOW -> "warm"
            GREEN -> "neutral"
            BLUE, INDIGO, VIOLET -> "cold"
        }
}

fun main() {
    var enumSample = EnumSample();
    var mnemonic = enumSample.getMnemonic(YELLOW)
    println("Mnemonic : $mnemonic")
    mnemonic = enumSample.getMnemonic(GREEN)
    println("Mnemonic : $mnemonic")
    println("Warm indicator :  ${enumSample.getWarmth(INDIGO)}")

}