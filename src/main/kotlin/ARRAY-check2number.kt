fun main (args: Array<String>){
    val size = readLine()!!.toInt()
    val arr = IntArray(size) { readLine()!!.toInt() }
    val (a, b) = readLine()!!.split(' ')
    var result = false
    result = arr.contains(a.toInt()) && arr.contains(b.toInt())
    if (result) println("YES") else println("NO")
}

/*

fun main() {
    val size = readLine()!!.toInt()
    val arr = IntArray(size) { readLine()!!.toInt() }
    val (p, m) = readLine()!!.split(' ').map { it.toInt() }
    println(if (p in arr && m in arr) "YES" else "NO")
}



fun main() {
    val arr = Array(readLine()!!.toInt()) { readLine()!!.toInt() }
    val nums = readLine()!!.split(' ').map { it.toInt() }
    print(if (nums[0] in arr && nums[1] in arr) "YES" else "NO")
}

fun main() {
    val list = List(readLine()!!.toInt()) { readLine()!! }
    val nums = readLine()!!.split(" ")
    println(if (nums[0] in list && nums[1] in list)"YES" else "NO")
}

fun main() {
    val size = readLine()!!.toInt()
    // Strict length multiline
    val array = Array(size) { readLine()!!.toInt() }
    // Single line with space
    val check: List<String> = readLine()!!.split(" ")
    // Check that both are in the array
    val result = if (array.contains(check[0].toInt()) && array.contains(check[1].toInt())) "YES" else "NO"
    print(result)
}

fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)
    var check1 = 0
    var check2 = 0
    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }
    val (p, m) = readLine()!!.split(' ').map(String::toInt)

    for (i in 0..array.lastIndex) {
        if (array[i] == p) {
            check1++
        } else if (array[i] == m) {
            check2++
        }

    }
    if (check1 > 0 && check2 > 0) {
        print("YES")
    } else {
        print("NO")
    }
}

import java.util.*

fun main() {

    val length = readLine()!!.toInt()
    val numbers = Array(length) {
        readLine()!!.toInt()
    }

    val temp = readLine()!!.split("\\s+".toRegex())
    val m = temp[0].toInt()
    val p = temp[1].toInt()

    var isMOccur = false
    var isPOccur = false

    repeat(length) {

        if (numbers[it] == m) isMOccur = true
        if (numbers[it] == p) isPOccur = true

        if (isMOccur and isPOccur) return@repeat
    }
    println(if (isMOccur and isPOccur) "YES" else "NO")
}


 */