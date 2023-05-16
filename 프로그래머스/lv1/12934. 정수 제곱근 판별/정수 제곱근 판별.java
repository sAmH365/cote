class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double d = Math.sqrt(n);
        int i = (int)d;
        
        if (d - i != 0) {
            answer = -1;
        } else {
            answer += Math.pow(d + 1, 2.0);
        }
        
        
        return answer;
    }
}