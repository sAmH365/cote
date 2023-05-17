class Solution {
    public int solution(int num) {
        int answer = 0;
        
        Long tmp = num + 0L;
        
        if (num == 1) {
            return answer = 0;
        }
        
        while (tmp >= 1) {
            if (tmp % 2 == 0) tmp /= 2;
            else tmp = (tmp*3) + 1;
            
            answer++;
            
            if (tmp == 1) {
              break;   
            }
            if (answer >= 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}