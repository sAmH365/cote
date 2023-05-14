import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        ArrayList<String> cap = new ArrayList();
        ArrayList<String> small = new ArrayList();
        
        char[] chars = s.toCharArray();
        
        for (char ch : chars) {
            if(Character.isUpperCase(ch)) {
                cap.add(ch+"");
            } else {
                small.add(ch+"");
            }
        }
        
        cap.sort(Collections.reverseOrder());
        small.sort(Collections.reverseOrder());
        
        for (int i=0;i<small.size();i++) {
            answer += small.get(i);
        }        
        for (int i=0;i<cap.size();i++) {
            answer += cap.get(i);
        }
        
        return answer;
    }
}