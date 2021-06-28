fun main (args: Array<String>){
    val size = readLine()!!.toInt()
    val myArray = IntArray(size)
    var result = 0
    for (i in 0..myArray.lastIndex) {
        myArray[i] = readLine()!!.toInt()
    }
    for (i in 1..myArray.lastIndex-1)
        if (myArray[i - 1] == myArray[i] - 1 && myArray[i] == myArray[i + 1] - 1)
            result++
    println(result)
}
/*
    val size = readLine()!!.toInt()
    val arr = IntArray(size) { readLine()!!.toInt() }
    var counter = 0
    for (i in 0..arr.lastIndex - 2) {
        if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2) counter++
    }
    println(counter)

Triples
Write a program that reads an array of integers and outputs the number of triples in the array.

A triple is three consecutive integers in ascending order — 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not.

The first line contains the size of the array.
The rest of the lines contain elements of the array.

Output a single integer value that is the number of triples in the array.

In the example below, there are two triples: 4,5,6 and 5,6,7.


Sample Input:
6
1
2
4
5
6
7

Sample Output:
2
*/