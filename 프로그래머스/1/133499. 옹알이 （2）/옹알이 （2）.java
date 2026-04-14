import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] dic = {"aya", "ye", "woo", "ma"};
        
        for (String b : babbling) {
            if (continueBable(b)) continue;
            
            for (int i = 0; i < dic.length; i++) {
                b = b.replace(dic[i], " ");
            }
            
            if (b.trim().length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean continueBable(String b) {
        return b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama");
    }
}