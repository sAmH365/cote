import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> ar = new ArrayList();
        
        ar.add(arr[0]);
        
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (prev == arr[i]) {
                continue;
            }
            
            ar.add(arr[i]);
            prev = arr[i];
        }
        
        int[] answer = new int[ar.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ar.get(i);
        }

        return answer;
    }
}