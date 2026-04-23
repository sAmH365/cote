import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap();
        
        // 1.참가자 기록
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        // 2.완주자와 비교하면서 숫자 차감
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }    
        
        // 3. 마지막 까지 남아있는 사람이 정답
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}