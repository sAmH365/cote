import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine().split(" ").map { it.toInt() }

    val valueSize = input[0]
    var value = input[1]

    val coins = arrayListOf<Int>()

    var index = 0
    var temp = 0
    var result = 0

    for (i in 0 until valueSize) {
        coins.add(Integer.parseInt(sc.nextLine()))
    }
    coins.sortDescending()

    while( value > 0) {
        if ((value / coins[index]) > 0) {
            temp = value / coins[index]
            result += value / coins[index]
            value -= (coins[index] * temp)
        }

        index++
    }

    println(result)
}