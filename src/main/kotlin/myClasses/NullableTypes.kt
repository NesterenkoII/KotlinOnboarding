package myClasses

fun main() {
    var a: String = "Hello"
    // a = null // NPE исключены

    a.length

    var b: String? = "Test"
    b = null

    //b.length

    // Вернет длину строки b, если null -> null (никаких NPE)
    b?.length

    //bob?.department?.head?.name -> null

    //Elvis operator - ?:
    val l = b?.length ?: -1

    b = if ((0..10).random() > 5) "line" else null
    //!! - throws NPE in case variable is null
    val t = b!!.length
}