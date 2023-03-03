import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {

    val input = nextLine()
    close()

    println(input[0].code)
}