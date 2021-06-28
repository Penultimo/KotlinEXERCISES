fun main (args: Array<String>){
    val n = readLine()!!.toInt()
    val arr = IntArray(n+1) {readLine()!!.toInt()}
    var counter = false
    if (arr[arr.lastIndex] in arr.dropLast(1)) counter = true
    if (counter) println("YES") else println("NO")
}