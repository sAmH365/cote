import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val s = nextLine().toLong()

    var maxOfN = 0L
    var start = 1L
    var end = s

    while (start <= end) {
        var mid =  (start + end) / 2

        if (sum(mid) <= s) {
            maxOfN = mid
            start = mid + 1
        } else {
            end = mid -1
        }
    }

    println(maxOfN)
}

fun sum(n: Long): Long {
    return n * (n + 1) / 2
}