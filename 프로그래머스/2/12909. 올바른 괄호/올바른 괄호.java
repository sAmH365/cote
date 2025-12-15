import java.util.Stack;

class Solution {
    boolean solution(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char el = s.charAt(i);

      if (el == '(') {
        stack.push(el);
      } else if (el == ')') {
        if (stack.empty()) {
          return false;
        }
        stack.pop();
      }
    }

    return stack.empty();
    }
}