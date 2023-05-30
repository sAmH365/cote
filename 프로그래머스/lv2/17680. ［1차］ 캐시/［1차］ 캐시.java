import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue q = new LinkedList<String>();
        
        if (cacheSize == 0) {
            answer = cities.length * 5;
        } else {
            for (int i=0; i<cities.length; i++) {
                String s = cities[i].toLowerCase();
                if (q.remove(s)) {
                    answer += 1;
                    q.add(s);
                } else {
                    answer += 5;
                    q.add(s);
                    
                    if (q.size() > cacheSize) {
                        q.remove();
                    }
                }
            }
                   
        }
        
        return answer;
    }
}