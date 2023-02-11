import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    sc.close()

    println(getResult(input))
}

fun getResult(mon: Int): Int {
    if ((mon % 4 == 0) && (mon % 100 != 0 || mon % 400 == 0)) {
        return 1
    }
    return 0
}
