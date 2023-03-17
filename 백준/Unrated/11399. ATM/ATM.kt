import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val people = Integer.parseInt(sc.nextLine())
    val time = sc.nextLine().split(" ").map { it.toInt() }
    sc.close()

    val sorted = time.sorted()

    var result = 0
    var temp = 0

    for (i in 0 until people) {
        result += (temp + sorted[i])
        temp += sorted[i]
    }
    println(result)

    /**
     *
     * result: 0 + 0 + 1 = 1
     * temp : 0 + 1 = 1
     *
     * result : 1 + 1 + 2 = 4
     * temp: 1 + 2 = 3
     *
     * result: 4 + 3 + 3 = 10
     * temp: 1 + 2 + 3 =6
     *
     * 1
     * (1) + 2
     * (1 + 2) + 3
     * (1 + 2 + 3) + 3
     *
     */
}