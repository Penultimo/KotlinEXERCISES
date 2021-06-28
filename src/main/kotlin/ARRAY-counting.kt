fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n) {readLine()!!.toInt()}
    var m = readLine()!!.toInt()
    var arrRes = arr.filter { it == m }
    println(arrRes.size)
}