import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, (a, b) -> {
           char c1 = a.charAt(n);
           char c2 = b.charAt(n);
            
           if (c1 == c2) {
               return a.compareTo(b);
           } else {
               return c1 - c2;
           }
        });
        
        return strings;
    }
}