import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    sc.close()

    println(facto(input))
}

fun facto(num: Int): Int {
    if (num <= 1) return 1
    else {
        return num * facto((num - 1))
    }
}