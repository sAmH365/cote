class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        
        for (s in my_string) {
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                continue    
            }
            
            answer += s
        }
        return answer
    }
}