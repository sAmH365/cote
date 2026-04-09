import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        for(int i = cards1.length - 1; i >= 0; i--) {
            stack1.push(cards1[i]);
        }
        for(int i = cards2.length - 1; i >= 0; i--) {
            stack2.push(cards2[i]);
        }
        
        for (int i = 0; i < goal.length; i++) {
            String target = goal[i];
            
            String ref = "";
            if (stack1.contains(target)) {
                ref = stack1.pop();
            } else {
                ref = stack2.pop();
            }
            
            if (!target.equals(ref)) {
                return "No";
            }
        }
        
        return "Yes";
    }
}