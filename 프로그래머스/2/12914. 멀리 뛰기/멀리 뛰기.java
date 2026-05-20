import java.util.*;

class Solution {
    public Map<Long, Long> map = new HashMap();
    
    public long solution(int n) {
        return fibo(n);
    }
    
    public long fibo(long n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        
        if (map.get(n) != null) {
            return map.get(n);
        }
        
        long r1 = fibo(n-1);
        long r2 = fibo(n-2);
        
        map.put(n, (r1 + r2) % 1234567);
        
        return (r1 + r2) % 1234567;
    }
}