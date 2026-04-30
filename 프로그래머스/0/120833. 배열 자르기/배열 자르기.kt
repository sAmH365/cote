class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        var answer: IntArray = IntArray(num2 - num1 + 1)
        
        for (i in 0 until answer.size) {
            answer[i] = numbers[num1 + i]
        }
        
        return answer
    }
}