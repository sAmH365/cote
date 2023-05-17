class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 임의 숫자중 3개 선택
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length;j++) {
                for (int k = j+1; k<nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    answer += isPrime(sum) ? 1 : 0;
                }
            }
        }

        return answer;
    }
    
    private boolean isPrime(int n) {
        boolean result = true;
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return result;
    }
}