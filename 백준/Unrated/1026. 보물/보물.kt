import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }
    val b = br.readLine().split(" ").map {it.toInt()}
    var result = 0

    val sortedA = a.sortedDescending()
    val sortedB = b.sorted()
    for (i in 0 until n) {
        result += sortedA[i] * sortedB[i]
    }

    println(result)
}