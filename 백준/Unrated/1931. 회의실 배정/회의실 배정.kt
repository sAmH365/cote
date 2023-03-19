import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = Integer.parseInt(br.readLine())

    val arr = Array(input){ Array(2) {0} }

    repeat(input) {
        val line = br.readLine().split(" ")
        arr[it][0] = line[0].toInt()
        arr[it][1] = line[1].toInt()
    }
    br.close()

    arr.sortWith(compareBy<Array<Int>> {it[1]}.thenBy { it[0] })

    var time = arr[0][1]
    var result = 0

    for (i in 1 until arr.size) {
        if (time <= arr[i][0]) {
            time = arr[i][1]
            result++
        }
    }

    println(result + 1)
}