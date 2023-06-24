import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2)-> o2 - o1);
        
        for (int i=0; i<priorities.length; i++) {
            q.add(priorities[i]);
        }
        
        // while(!q.isEmpty()) {
        //     System.out.print(q.poll() + " ");
        // }
        
        // 9 ,1, 1, 1, 1, 1
        // location: 0 
        // peek: 9
        
        // 1, 1, 1, 1, 1
        // peek: 1
        
        while(!q.isEmpty()) {
            for (int i=0; i<priorities.length;i++) {
                if (priorities[i] == q.peek()) {
                    if (i == location)
                    return answer;

                    q.poll();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}