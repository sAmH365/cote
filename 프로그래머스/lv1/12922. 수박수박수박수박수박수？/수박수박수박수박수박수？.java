class Solution {
    public String solution(int n) {
        String answer = "";
        String su = "수";
        String bak = "박";
        
        for (int i=1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += bak;
            } else {
                answer += su;
            }
        }
        
        return answer;
    }
}