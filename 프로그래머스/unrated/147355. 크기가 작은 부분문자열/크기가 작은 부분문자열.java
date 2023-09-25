import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        List<Long> ar = new ArrayList();
        
        for (int i=0; i < (t.length()-len + 1);i++){
            ar.add(Long.parseLong(t.substring(i, len + i)));
        }
        
        for (int i=0; i<ar.size();i++) {
            if (ar.get(i) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}