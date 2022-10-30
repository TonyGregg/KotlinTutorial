package basics
import strings.*

class CollsStrAndRegExpressions {
    fun playWithCollection() {
        /**
         * Kotlin doesn’t have its own set of collection classes.
         * All of your existing knowledge about Java collections still applies here.
         */
        val set = hashSetOf(1, 2, 20)
        val list = arrayListOf(2, 5, 25)
        val map = hashMapOf(0 to "Not", 0 to "Not", 7 to "Seven")
        println(map) // o/p : {0=Not, 7=Seven} //invokes toString()
    }

    fun playWithStrings() {
        /**
         * you can do much more with them in Kotlin. For example, you can get the last element in a list or find a
         * maximum in a collection of numbers:
         */
        val strings = listOf<String>("one", "two", "three")
        println(strings.first())
        println(strings.last())

        val numbers = setOf(10, 25, 52, 21)

        println(numbers.max())

        val c = "Kotlin".lastChar()
    }
}

fun main() {
    val colls = CollsStrAndRegExpressions();
    colls.playWithCollection()
    colls.playWithStrings()
}