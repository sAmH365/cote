import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> ar = new ArrayList();
        
        for (int i=0;i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                ar.add(arr[i]);
            }
        }
        
        if (ar.size() == 0) {
            ar.add(-1);
        }
        
        Collections.sort(ar);

        int[] answer = new int[ar.size()];
        for (int i=0; i < ar.size(); i++) {
            answer[i] = ar.get(i);
        }
        
        return answer;
    }
}