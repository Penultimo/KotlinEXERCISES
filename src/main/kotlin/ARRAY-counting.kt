fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n) {readLine()!!.toInt()}
    var m = readLine()!!.toInt()
    var arrRes = arr.filter { it == m }
    println(arrRes.size)
}
/*
fun main() {
    val nums = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val repeat = readLine()!!.toInt()
    var times = 0
    for (num in nums)
        if (num == repeat) times++
    println(times)
}

fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()
    var count = 0
    for (i in 0..array.lastIndex) {
        if (array[i] == m) {
            count++
        }
    }
    println(count)
}

fun main() {
    val count = readLine()!!.toInt()
    val array = IntArray(count)

    var result = 0

    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }

    val num = readLine()!!.toInt()

    for (i in 0..array.lastIndex) {
        if (num == array[i]) result += 1
    }
    print(result)
}

*/
