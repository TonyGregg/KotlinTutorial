package basics

class FizFuzz {
    fun fizFuzzFn(i: Int) = when {
        i %  15 == 0 -> "FizBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"

        else -> "$i" // else return the i itself
    }


}

fun main(args: Array<String>) {
    val fizFuzz = FizFuzz();
    for (i in 1..100) {
        println(fizFuzz.fizFuzzFn(i))
    }
}