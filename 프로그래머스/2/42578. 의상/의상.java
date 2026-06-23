import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, List<String>> map = new HashMap();
        
        for (String[] clos : clothes) {
            String cloth = clos[0];
            String type = clos[1];
            
            List<String> clothList = map.getOrDefault(type, new ArrayList());
            clothList.add(cloth);
            map.put(type, clothList);
        }
        
        for (String key : map.keySet()) {
            List<String> clothList = map.get(key);
            System.out.print("type: " + key + "   clothes: " + clothList.toString());
            System.out.println();
            answer *= (clothList.size() + 1);
        };
        
        return answer - 1;
    }
}