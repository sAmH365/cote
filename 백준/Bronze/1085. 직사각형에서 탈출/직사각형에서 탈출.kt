import java.util.*

fun main() {

    val sc = Scanner(System.`in`)
    val input = sc.nextLine().split(" ").map { it.toInt() }

    val x = input[0]
    val y = input[1]
    val w = input[2]
    val h = input[3]

    val wMinusX = w - x
    val hMinusY = h - y

    val result = listOf(x, y, wMinusX, hMinusY).sorted()

    println(result[0])
}
