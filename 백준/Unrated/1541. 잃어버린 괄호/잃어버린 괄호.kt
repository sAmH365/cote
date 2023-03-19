import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val minusArr = input.split("-")
    var result = 0

    for (i in minusArr.indices) {
        val plusArr = minusArr[i].split("+")

        for (j in plusArr.indices) {
            if (i == 0) {
                result += plusArr[j].toInt()
            } else {
                result -= plusArr[j].toInt()
            }
        }
    }

    println(result)
}