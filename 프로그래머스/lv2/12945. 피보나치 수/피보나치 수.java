class Solution {
public static int solution(int n) {
        int[] tmp = new int[n + 1];
        tmp[0] = 0;
        tmp[1] = 1;
    
        for (int i = 2; i <= n; i++) {
            tmp[i] = (tmp[i - 1] + tmp[i - 2]) % 1234567;
        }

        return tmp[n] ;
    }
}