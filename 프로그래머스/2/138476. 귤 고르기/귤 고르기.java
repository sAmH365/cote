import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int tmp = 0;
        
        Map<Integer, Integer> map = new HashMap();
        
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        
        Set<Integer> keySet = map.keySet();
        
        int i = 0;
        int[] intArr = new int[keySet.size()];
        for (Integer key : keySet) {
            intArr[i++] = map.get(key);
        }
        Arrays.sort(intArr);
        
        for (int j = intArr.length - 1; j >= 0; j--) {
            int cur = intArr[j];
            tmp += cur;
            answer++;
            if (tmp >= k) {
                break;
            }
        }
        
        return answer;
    }
}