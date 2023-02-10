import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val input = nextLine().toInt()
    var result: Int = 0

    for ( index in 1 .. input) {
        result += index
    }

    println(result)
}