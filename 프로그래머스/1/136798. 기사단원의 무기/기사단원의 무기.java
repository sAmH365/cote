import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int j = 0;
        List<Integer> tmp = new ArrayList();
        
        for (int i = 1; i <= number; i++) {
            tmp.add(count(i));
        }
        
        for (int i = 0; i < tmp.size(); i++) {
            int target = tmp.get(i);
            
            if (target <= limit) {
                answer += target;
            } else {
                answer += power;
            }
            
        }
        
        return answer;
    }
    
    
    public int count(int n) {
        int result = 0;
        
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) result++;
            else if (n % i == 0) result += 2;
        }
        
        return result;
    } 
}