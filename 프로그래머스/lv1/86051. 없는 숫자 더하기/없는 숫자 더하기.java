import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> ar = new ArrayList();
        
        for (int i : numbers) {
            ar.add(i);
        }
        
        for (int i=0;i<10;i++) {
            if(!ar.contains(i)) answer+=i;
        }
        
        return answer;
    }
}