import java.util.Scanner

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    sc.close()

    for (i in input downTo 1) {
        for (j in 1..i) {
            print("*")
        }

        println()
    }
}