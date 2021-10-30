package myClasses

fun main() {
    println(testSimple5(5)) //10

    testNamedArguments(1, 2, 3)
    testNamedArguments(y = 2, z = 3, x = 1)

    testDefaultArguments()
    testDefaultArguments(2, 2)

    printEven(1,2,3,4,5,6,7,8)
    println("PrintEven")
    printEven(*intArrayOf(1, 2, 3, 4, 5), 6, 7, 8, 9, 10)
}

fun testSimple(): Int {
    return 5 + 5
}

fun testSimple2(): Int = 5 + 5

fun testSimple3(x: Int, y: Int): Int = x + y

fun testSimple4(x: Int, y: Int) = x + y

fun testSimple5(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//void
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.uppercase() else name) + number
}

//vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}