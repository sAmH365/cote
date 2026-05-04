class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        
        for (s in my_string) {
            if (s.isDigit()) {
                answer += s.toString().toInt()
            }
        }        
        
        return answer
    }
}