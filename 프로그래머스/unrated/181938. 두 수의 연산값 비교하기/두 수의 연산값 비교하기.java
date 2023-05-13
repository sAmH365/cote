class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String x = a+"";
        String y = b+"";
        
        if (Integer.parseInt(x+y) >= 2 * a * b) {
            answer = Integer.parseInt(x+y);
        } else {
            answer = 2 * a * b;
        }
        
        return answer;
    }
}