class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean b = n % 2 == 0;
        
        if (b) {
            for (int i=0;i<=n;i+=2) {
                answer += (i*i);
            }
        } else {
            for (int i=1; i<=n; i+=2) {
                answer += i;
            }
        }
        
        return answer;
    }
}