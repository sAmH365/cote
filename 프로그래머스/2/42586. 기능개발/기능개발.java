import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> tmp = new ArrayList();
        Queue<Integer> q = new LinkedList();

        int prevRemainDay = 0;
        for (int i=0; i < progresses.length; i++) {
            int progress = progresses[i]; // 현재 진도율
            int speed = speeds[i];
            
            int remain = 100 - progress;
            int remainDay = (int) Math.ceil( (double)remain / speed);
            q.offer(remainDay);
        }
        
        int baseDay = q.poll();
        int count = 1;
        while(!q.isEmpty()) {
            int ref = q.poll();
            if (baseDay >= ref) {
                count++;
            } else {
                tmp.add(count);
                count = 1;
                baseDay = ref;
            }
            
            if (q.isEmpty()) tmp.add(count);
        }
        
        int[] answer = new int[tmp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tmp.get(i);
        }
        
        return answer;
    }
}