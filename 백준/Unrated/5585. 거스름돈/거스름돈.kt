
fun main() = with(System.`in`.bufferedReader()) {
    var value = 1000 - readLine().toInt()
    var temp = 0
    var result = 0


    while (value > 0) {
        if (value / 500 > 0) {
            temp = value / 500
            result += temp
            value -= (500 * temp)
        } else  if (value / 100 > 0) {
            temp = value / 100
            result += temp
            value -= (100 * temp)
        } else if (value / 50 > 0) {
            temp = value / 50
            result += temp
            value -= (50 * temp)
        } else if (value / 10 > 0) {
            temp = value / 10
            result += temp
            value -= (10 * temp)
        } else if (value / 5 > 0) {
            temp = value / 5
            result += temp
            value -= (5 * temp)
        } else {
            temp = value / 1
            result += temp
            value -= (1 * temp)
        }
    }

    println(result)
}