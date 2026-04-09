import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            int cur = score[i];
            // k: 3
            // size: 0, 1, 2, 3

            if (pq.size() < k) {
                pq.offer(cur);
            } else {
                if (cur > pq.peek()) {
                   pq.poll();
                   pq.offer(cur);
                }
            }
            
            answer[i] = pq.peek();
        }
        
        // 0 40 300 300
        // 0 
        
        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        
        return answer;
    }
}