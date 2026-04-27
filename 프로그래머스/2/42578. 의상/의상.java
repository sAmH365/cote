import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap();
        for(String[] strs : clothes) {
            String type = strs[1];
            
            // System.out.println(type);
            
            map.put(type, map.getOrDefault(type, 0) + 1);
            
            // System.out.println(map.get(type));
        }
        
        for (String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        
        return answer - 1;
    }
}