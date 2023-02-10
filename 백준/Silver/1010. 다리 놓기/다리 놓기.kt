import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val testCaseNum = nextLine().toInt()
    val results: MutableList<BigInteger> = mutableListOf()

    for(index in 1 .. testCaseNum) {
        val input = nextLine().split(" ").map { it.toInt() }
        val comb = comb(input[1], input[0])
        results.add(comb)
    }

    for (result in results) {
        println(result.toInt())
    }
}

fun comb(n: Int, r: Int): BigInteger {
    return facto(n.toBigInteger()) / (facto(r.toBigInteger()) * facto((n - r).toBigInteger()))
}

fun facto(x: BigInteger): BigInteger {
    return if (x <= 1.toBigInteger()) 1.toBigInteger()
    else x * facto(x.minus(1.toBigInteger()))
}