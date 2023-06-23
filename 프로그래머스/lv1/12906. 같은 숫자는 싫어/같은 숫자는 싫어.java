import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack();
        
        for (int i=0; i<arr.length; i++) {
            if (stack.size() == 0) stack.push(arr[i]);
            if (stack.peek() != arr[i]) stack.push(arr[i]);
        }
        
        answer = new int[stack.size()];
        int i=0;
        
        while(stack.size() != 0) {
            answer[stack.size()-1] = stack.pop();
        }

        return answer;
    }
}