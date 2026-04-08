import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        int idx = 1;
        
        for (int i = 1; i < s.length(); i++) {
            char target = s.charAt(i);
            boolean found = false;
            
            for (int j = Math.max(i - 1, 0); j >= 0; j--) {

                char ref = s.charAt(j);
                
                if (target == ref) {
                    answer[idx++] = i - j;
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                answer[idx++] = -1;
            }
        }
        
        return answer;
    }
}