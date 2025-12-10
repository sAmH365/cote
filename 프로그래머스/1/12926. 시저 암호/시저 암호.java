import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String[] strs = s.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < strs.length; i++) {
          if (strs[i].equals(" ")) {
            sb.append(" ");
            continue;
          }
          char c = (char)(strs[i].charAt(0) + n);

          if ((c > 'Z' && c < 'a') || c > 'z') {
            c = (char)(c - ('z'-'a'+1));
          }

          sb.append(c);
        }
        
        
        String answer = sb.toString();
        return answer;
    }
}