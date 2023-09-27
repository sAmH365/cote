class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int serviceCount = 0;
        
        if (n>=10) serviceCount = n / 10;
        
        answer = 12000 * n + 2000 * (k - serviceCount);
        
        return answer;
    }
}