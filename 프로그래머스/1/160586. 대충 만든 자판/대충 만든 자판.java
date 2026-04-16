import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
       int[] answer = new int[targets.length];
       int r = 0;
        
       Map<String, Integer> buttonMap = new HashMap();
        
        for (int j = 0; j < keymap.length; j ++) {
            String k = keymap[j];
            
            for (int i = 0; i < k.length(); i++) {
                String key = String.valueOf(k.charAt(i));
                Integer value = Math.min(buttonMap.getOrDefault(key, 101), i + 1);
                
                buttonMap.put(key, value);
            }
            
        }
            
            for (String t : targets) {
                int count = 0;

                for (int i = 0 ; i < t.length(); i++) {
                    String word = String.valueOf(t.charAt(i));
                    
                    Integer value = buttonMap.get(word);
                    
                    // String tmp = String.format("word : %s, value: %s, count: %d", word, value, count);
                    // System.out.println(tmp);
                    
                    if (value == null) {
                     count = -1;
                     break;
                    } else {
                     count += value;   
                    }
                }
                
                answer[r++] = count;
            }
    
        return answer;
    }
}