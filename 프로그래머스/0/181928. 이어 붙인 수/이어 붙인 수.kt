class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        
        var odd: String = ""
        var even: String = ""
        
        for (num in num_list) {
            if (num % 2 == 0) {
                odd += num
            } else {
                even += num
            }
        }
        
        answer = odd.toInt() + even.toInt()
        
        return answer
    }
}