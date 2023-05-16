import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int[] answer = new int[1];
        
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
            answer[0] = -1;
        }
        
        if (answer[0] == -1) {
            return answer;
        } else {
            answer = new int[al.size()];
            for (int i=0; i<answer.length;i++) {
                answer[i] = al.get(i);
            }
        }
        
        return answer;
    }
}