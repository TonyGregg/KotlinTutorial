package basics

/**
 * Custom accessors
 * Suppose you declare a rectangle that can say whether it’s a square. You don’t need to store that information as a
 * separate field, because you can check whether the height is equal to the width on the run:
 */
class CustomAccessorRectangle(private val height: Int, private val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

}

fun main(args: Array<String>) {
    val rect =  CustomAccessorRectangle(40,50)
    println("Is square ? ${rect.isSquare}")
}
