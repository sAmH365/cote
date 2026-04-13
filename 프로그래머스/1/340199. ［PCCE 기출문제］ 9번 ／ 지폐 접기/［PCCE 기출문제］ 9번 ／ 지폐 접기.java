import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int w1 = wallet[0];
        int w2 = wallet[1];
        
        int b1 = bill[0];
        int b2 = bill[1];
        
        while (true) {
            if ((w1 >= b1 && w2 >= b2) || (w1 >= b2 && w2 >= b1)) {
                break;
            }
            
            if (b1 <= b2) {
                b2 = b2 / 2;
            } else {
                b1 = b1 / 2;
            }
            
            answer++;
        }
        
    
        return answer;
    }
}