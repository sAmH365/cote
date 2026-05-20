import java.util.*;

public class Solution {
    
    public int solution(int n) {
        int battery = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                battery += 1;
                n -= 1;
            }
            
            n /= 2;
        }
        
        return battery;
    }
}