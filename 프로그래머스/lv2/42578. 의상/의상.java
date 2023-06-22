import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap();
        for (int i=0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for (String key : map.keySet()) {
            System.out.println("key : " + key + "   value: " + map.get(key));
        }
        
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        
        return answer - 1;
    }
}