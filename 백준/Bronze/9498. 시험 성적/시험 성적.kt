import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    sc.close()

    when(input) {
        in 90 ..100 -> println("A")
        in 80 ..89 -> println("B")
        in 70 ..79 -> println("C")
        in 60 ..69 -> println("D")
        else -> println("F")
    }
}
