import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> ar = new ArrayList();
        
        for (int i=0; i < strings.length; i++) {
            ar.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(ar);
        
        String[] answer = new String[strings.length];
        for (int i=0; i< answer.length; i++) {
            answer[i] = ar.get(i).substring(1);
        }
        
        return answer;
    }
}