package basics

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice", age = 40), Person("Bob", age = 29))

    val oldest = persons.maxBy { it.age ?:0 }
    println("Oldest is $oldest")
    val person = Person("Mr. Bob", 29); // notice no new !
    println(person.name)

}
