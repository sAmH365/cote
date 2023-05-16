import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String tmp = n + "";
        char[] chars = tmp.toCharArray();
        String str = "";
        
        Arrays.sort(chars);
        
        for (int i=chars.length-1; i>=0; i--) {
            str += chars[i];
        }
        
        answer = Long.parseLong(str);
        
        return answer;
    }
}