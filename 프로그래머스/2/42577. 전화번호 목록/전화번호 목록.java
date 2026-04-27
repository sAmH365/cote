import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
            
        Set<String> set = new HashSet<>();
        
        for (String s : phone_book) {
            set.add(s);
        }
        
        for (String s : phone_book) {
            int len = s.length();
            
            for (int i = 1 ; i < len; i++) {
                String split = s.substring(0, i);
                if (set.contains(split)) return false;
            }
        }
            
        return answer;
    }
}