import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> ar = new ArrayList();
        ArrayList<Integer> list = new ArrayList();
        
        Queue<Work> q = new LinkedList();
        Queue<Integer> remainDay = new LinkedList();
        
        for (int i=0; i<progresses.length;i++) {
            q.add(new Work(i, progresses[i], speeds[i]));
        }
        
        while(q.size() != 0) {
            Work work = q.poll();
            double remain = (double)(100-work.progress);
            int day = (int)Math.ceil(remain / work.speed);
            remainDay.add(day);
            System.out.print(day + ", ");
        }
        
        int count = 1;
        int tmp = remainDay.poll();
        
        while (!remainDay.isEmpty()) {
            if (tmp >= remainDay.peek()) {
                count++;
                remainDay.poll();
            } else {
                list.add(count);
                count = 1;
                tmp = remainDay.poll();
            }
        }
        list.add(count);
        
        
        answer = new int[list.size()];
        for (int i =0; i<answer.length;i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    static class Work{
        int index;
        int progress;
        int speed;
        
        public Work(int index, int progress, int speed) {
            this.index = index;
            this.progress = progress;
            this.speed = speed;
        }
    }
}