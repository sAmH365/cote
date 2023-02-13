import java.util.*

fun main() {

    val sc = Scanner(System.`in`)
    val input = sc.nextLine().toInt()
    sc.close()

    for (i in 1..9) {
        println("$input * $i = ${input * i}")
    }
}