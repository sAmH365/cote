import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> partiMap = new HashMap<>();
        
        for (String p : participant) {
            partiMap.put(p, partiMap.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            Integer value = partiMap.get(c);
            if (value != null) {
                partiMap.put(c, value - 1);
            }
        }
        
        Set<String> keys = partiMap.keySet();
        for (String k : keys) {
            Integer v = partiMap.get(k);
            if (v != 0) {
                return k;
            }
        }
        
        return "";
    }
}