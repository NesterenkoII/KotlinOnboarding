package myClasses

fun main() {
    val array1 = listOf(1, 2, 3, 2, 0, 2, 2, 2)
    val array2 = listOf(5, 1, 2, 7, 3, 2)
    val arrayTemp1 = listOf(if (array1.size < array2.size) array1 else array2)
    val arrayTemp2 = listOf(if (array1.size < array2.size) array2 else array1)
    var result = ArrayList<Int>()
    var count = 0
    var value = 0
    var i = 0

    for (item1 in arrayTemp1) {
        for (item2 in if (array1.size < array2.size) array2 else array1) {
            if (i != arrayTemp1.size) {
                if (item1 == item2) {
                    value = item1
                    count++
                }
            }
        i++
        while (count > 0) {
            result.add(value)
            count--
        }
    }
    }
    println("Arra1: $array1")
    println("Arra2: $array2")
    println("Result: $result")
}