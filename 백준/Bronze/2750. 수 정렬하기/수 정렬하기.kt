import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val n = nextInt()
    val arr = mutableListOf<Int>()

    for(i: Int in 1 .. n) {
        arr.add(nextInt())
    }
    arr.sort()

    for (i in arr) {
        println(i)
    }
}