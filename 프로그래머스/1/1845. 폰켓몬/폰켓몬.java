import java.util.*;

class Solution {
    public int solution(int[] nums) {    
        int answer = 0;
        
        Set set = new HashSet();
        
        for (int i : nums) {
            set.add(i);
        }
        
        answer = Math.min(nums.length / 2, set.size());
        
        return answer;
    }
}