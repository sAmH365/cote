import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = findElement(array, commands[i]);
        }

        return answer;
    }
    
    public int findElement(int[] array, int[] command) {
        int startIdx = command[0] - 1;
        int endIdx = command[1] - 1;
        int targetIdx = command[2] - 1;
        
        int size = endIdx - startIdx + 1;
        int[] arr = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[startIdx + i];
        }
        
        Arrays.sort(arr);
        
        return arr[targetIdx];
    }
}