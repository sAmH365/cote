import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine().split(" ").map { it.toInt() }
    sc.close()
    
    println(input[0] * input[1])
}
