import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        
        ArrayList<Integer> al = new ArrayList();
        
        
        if (arr.length != 1 ) {
            for (int i=0;i < arr.length - 1; i++) {
                if (min > arr[i+1]) {
                    min = arr[i+1];
                }
            }
            
            for (int i=0; i< arr.length; i++) {
                if (min == arr[i]) continue;
                else {
                    al.add(arr[i]);
                }
            }
        } else {
            al.add(-1);
        }
        
        int[] answer = new int[al.size()];
        
        if (al.get(0) == -1) {
            answer[0] = -1;
            return answer;
        } else {
            for (int i=0; i<answer.length;i++) {
                answer[i] = al.get(i);
            }
        }
        
        return answer;
    }
}