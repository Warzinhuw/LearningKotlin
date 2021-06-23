package objectOrientation

open class Being
open class Person : Being()
class Student : Person()

fun main(args: Array<String>) {

    // Covariance = we can use a "more derived" type (a subtype)

    val people : MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student()) //covariance

    //Being does not fulfill the contract of class Person
    //people.add(Being())

    //Read-only collections are covariant
    val p: Person = Student() //covariance

    //val students: List<Person> = listOf<Student>()
    //val students: MutableList<Person> = mutableListOf<Student>()

}