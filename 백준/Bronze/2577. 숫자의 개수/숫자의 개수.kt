import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val input1 = nextInt()
    val input2 = nextInt()
    val input3 = nextInt()
    close()

    var num = input1 * input2 * input3
    val arr = Array(10){0}

    while (num > 0) {
        arr[num % 10]++
        num /= 10
    }

    for (i in 0 until 10) {
        println(arr[i])
    }
}