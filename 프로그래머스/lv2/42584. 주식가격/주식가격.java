import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        int time = 1;
        stack.push(time);
        
        for(int i=1; i<prices.length; i++) {
            if (prices[stack.peek() - 1] <= prices[i]) {
                stack.push(++time);
            } else {
                answer[stack.peek() - 1] = 1; // 1초만에 가격 떨어짐
                stack.pop();
                ++time;
                
                while (!stack.isEmpty() && prices[stack.peek() - 1] > prices[time - 1]) {
                    int preTime = stack.pop();
                    answer[preTime - 1] = time - preTime;
                }
                stack.push(time);
            }
        }

        int lastTime = stack.peek();
        for(int i=answer.length - 1; i >= 0; i--) {
            if (answer[i] != 0) continue;
            else {
                answer[i] = lastTime - stack.pop();   
            }
        }

        return answer;
    }
}