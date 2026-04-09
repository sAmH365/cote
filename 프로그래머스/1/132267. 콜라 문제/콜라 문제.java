class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int addCoke = (n / a) * a / a * b; // 10
            int remain = n % a;  // 
            n = remain + addCoke;
            
            answer += addCoke;
        }
        return answer;
    }
}