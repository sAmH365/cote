import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        
        Stack<String> stack = new Stack();
        
        String[] strs = s.split("");
        
        for (String str : strs) {
            if (!stack.isEmpty()) {
              String peek = stack.peek();  
              if (peek.equals(str)) {
                  stack.pop();
                  continue;
              }
            }

            stack.push(str);
        }
        
        answer = stack.isEmpty() ? 1 : 0;

        return answer;
    }
}