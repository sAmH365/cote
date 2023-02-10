import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val input = nextLine().split(" ").map { it.toBigInteger() }

    println(input[0] + input[1])
}