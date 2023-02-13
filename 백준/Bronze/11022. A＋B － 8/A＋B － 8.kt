import java.util.*

fun main() {

    val sc = Scanner(System.`in`)
    val input = sc.nextLine().toInt()

    for (i in 1..input) {
        val input2 = sc.nextLine().split(" ").map { it.toInt() }
        println("Case #${i}: ${input2[0]} + ${input2[1]} = ${input2[0]+input2[1]}")
    }
    sc.close()
}
