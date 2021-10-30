package myClasses

fun main() {
    testWhen(1)
    testWhen(2)
    testWhen("Hello")
    testWhen(15)
    testWhen(43)
}

// testWhen(Object object)
fun testWhen(input: Any) {
    input

    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("From 10 to 20")
        is String -> println("String was entered ${input.length}")
        else -> println("Something else")
    }

    // (String) object;
}

/**
 * public void test(Object input)
 * if (input instanceof String)
 *      String strInput = (String) input
 * else ...
 */