package myClasses

fun main() {
    val child = Person("Child","Child", 1,)
    val p1 = Person("Tom","Jones", 35)
    println(p1.firstName)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2) // true

}

//Primary constructor
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList in Java

    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String,lastName: String, age: Int, child: Person):
            this(firstName, lastName, age) {
        children.add(child)
    }

    // constructor without params
    constructor():
            this(",","",-1) {
    }
}

data class Rectangle(var height: Double, var lenght: Double) {
    val perimeter = (height + lenght) * 2

    var test = 1
        get() = field + 1 // this.field (test field in this case
        set(value) {
            if(value < 0) println("Negative value")
            field = value
        }

    fun area() = height * lenght
}