import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val input = nextInt()
    close()

    for( i in 1 .. input) {
        for (j in input - i downTo 1) {
            print(" ")
        }

        for ( z in 1..i) {
            print("*")
        }

        println()
    }
}