import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        // 1. 이름별 그리움 점수 저장
        for (int i = 0; i < name.length; i++) {
            String key = name[i];
            int value = yearning[i];
            
            map.put(key, value);
        }
        
        int j = 0;
        for (String[] phothos : photo) {
            int result = 0;
            for (int i = 0; i < phothos.length; i++) {
                String key = phothos[i];
                
                result += map.getOrDefault(key, 0);
            }
            
            answer[j++] = result;
        }
        
        // for (String key : map.keySet()) {
        //     System.out.println("key " + key + "  value: " + map.get(key));
        // }
        
        
        
        // 2. photho 순회하면서 맵의 더하고 결과 저장
        
        return answer;
    }
}