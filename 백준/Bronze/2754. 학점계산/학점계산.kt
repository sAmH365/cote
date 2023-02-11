import java.util.*
import kotlin.collections.HashMap

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    sc.close()

    val scoreMap = mutableMapOf<String, Float>()
    scoreMap["A+"] = 4.3F
    scoreMap["A0"] = 4.0F
    scoreMap["A-"] = 3.7F
    scoreMap["B+"] = 3.3F
    scoreMap["B0"] = 3.0F
    scoreMap["B-"] = 2.7F
    scoreMap["C+"] = 2.3F
    scoreMap["C0"] = 2.0F
    scoreMap["C-"] = 1.7F
    scoreMap["D+"] = 1.3F
    scoreMap["D0"] = 1.0F
    scoreMap["D-"] = 0.7F
    scoreMap["F"] = 0F

    println(scoreMap[input])
}
