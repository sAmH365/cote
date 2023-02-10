import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val input = nextLine().split(" ")

    val money = input[0].toBigInteger()
    val unit = input[1].toBigInteger()

    println(money / unit)
    println(money % unit)
}