import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val input = nextLine().toInt()
    val inputs = nextLine().split(" ").map { it.toInt() }
    close()

    val sortedNum = inputs.sorted()
    
    println("${sortedNum[0]} ${sortedNum[sortedNum.size - 1]}")
}