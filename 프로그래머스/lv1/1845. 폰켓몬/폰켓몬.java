import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 중복 제거 -> 해시
        // 최대 개수 = nums.length / 2
        int max = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap();
        
        // 해시 테이블에 포켓몬 집어넣기  [1, 2, 3]
        for (int num : nums) {
            map.put(num, num);
        }

        // 최대 개수랑 비교하면서 answer수 증가
        for (Integer key : map.keySet()) {
            if (answer >= max) break;
            answer++;
        }
        
        return answer;
    }
}