import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<String, String> map = new HashMap<>();
        
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); ) {
            boolean matched = false;
            
            for (String key : map.keySet()) {
                matched = s.startsWith(key, i);
                // System.out.println("key : " + key + " i :" + i + "matched: " + matched);
                
                if (matched) {
                    String value = map.get(key);
                    sb.append(value);
                    i += key.length();
                    break;
                }
            }
            
            // 숫자인 경우 그대로 사용
            if (!matched) {
              sb.append(s.charAt(i));    
              i++;
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}