import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        Map<Integer, Integer> map = new HashMap();
        map.put(6, 1); // 6개 맞으면 1등
        map.put(5, 2);
        map.put(4, 3);
        map.put(3, 4);
        map.put(2, 5);
        
        // 0 0 1 25 31 44
        // 1 6 10 19 31 45
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int cnt = 0;
        int zero = 0;
        
        
        for (int l : lottos) {
            if (l == 0) {
                 zero++;
                 continue;   
                }
            
            for (int w : win_nums) {
                if (w == l) cnt++;                    
            }
        }
        
        // System.out.println(cnt);
        // System.out.println(zero);
        
        answer[0] = map.getOrDefault(cnt + zero, 6);
        answer[1] = map.getOrDefault(cnt, 6);
        
        
        return answer;
    }
}