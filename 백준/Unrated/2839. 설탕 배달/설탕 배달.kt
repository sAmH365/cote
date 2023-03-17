import java.util.Scanner

fun main(args: Array<String>) {
    val threeKg = 3
    val fiveKg = 5
    var result = 0

    val sc = Scanner(System.`in`)
    var input = sc.nextInt()
    sc.close()

    while (true) {
        if (input.rem(fiveKg) == 0) {
            println("${input / fiveKg + result}")
            break
        } else if(input <= 0) {
            println(-1)
            break
        }

        input -= threeKg
        result++
    }

}