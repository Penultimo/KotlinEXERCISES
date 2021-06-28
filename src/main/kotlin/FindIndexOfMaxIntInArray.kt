fun main (args: Array<String>){
    val size = readLine()!!.toInt()
    val arra = IntArray(size)

    for (i in 0..arra.lastIndex) {
        arra[i] = readLine()!!.toInt()
    }

    val max = arra.maxOrNull()!!
    println(findIndex(arra, max))
}

fun findIndex(arr: IntArray, item: Int): Int {
    return arr.indexOf(item)
}

/*Sample Input:
5
2
5
3
4
5

Sample Output:
1


Sample Input:
6
1000
10
1000
10
10
1001

Sample Output:
*/