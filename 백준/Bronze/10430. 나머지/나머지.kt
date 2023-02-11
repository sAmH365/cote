import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine().split(" ").map { it.toInt() }
    sc.close()

    val a = input[0]
    val b = input[1]
    val c = input[2]

    println((a+b)%c)
    println(((a%c) + (b%c))%c)
    println((a*b)%c)
    println(((a%c) * (b%c))%c)
}
