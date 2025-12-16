import java.util.*;

class Solution {
    public int solution(int[] sides) {
        
        Arrays.sort(sides);
        
        int max = sides[sides.length - 1];
        int e1 = sides[0];
        int e2 = sides[1];
        
        return e1 + e2 > max ? 1 : 2;
    }
}