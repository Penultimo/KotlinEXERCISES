fun main (args: Array<String>){
    val n = readLine()!!.toInt()
    val arr = IntArray(n+1) {readLine()!!.toInt()}
    var counter = false
    if (arr[arr.lastIndex] in arr.dropLast(1)) counter = true
    if (counter) println("YES") else println("NO")
}

/*
fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }

    println(if (readLine()!!.toInt() in array) "YES" else "NO")
}
*/
