import java.util.*

fun main() {

    val sc = Scanner(System.`in`)
    val input1 = sc.nextLine().toBigInteger()
    val input2 = sc.nextLine()
    val input3 = sc.nextLine().toBigInteger()
    sc.close()

    if(input2.equals("+")) {
        println(input1 + input3)
    } else {
        println(input1 * input3)
    }
}
