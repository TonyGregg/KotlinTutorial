package collection

class CollectionExperimenter {
    fun printMaxAge(people: List<Person>) {
        println(people.maxBy { it.age })
        // also possible using member reference
        println(people.maxBy(Person::age))

    }
}
fun main() {
    val people = listOf(Person("Alice", 30), Person("Bob", 21))
    val collectionExperimenter = CollectionExperimenter()
    collectionExperimenter.printMaxAge(people)
}