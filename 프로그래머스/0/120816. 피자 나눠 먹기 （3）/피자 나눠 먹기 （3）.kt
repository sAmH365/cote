import kotlin.math.*

class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        
        answer = ceil(n / slice.toDouble()).toInt()
        
        return answer
    }
}