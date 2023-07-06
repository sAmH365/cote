import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        int sum = 0; // 다리 위의 무게 합
        
        for (int truck : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.add(truck);
                    sum += truck;
                    answer++;
                    break;
                } else if(q.size() == bridge_length) {
                    sum -= q.poll();
                } else {
                    if (sum + truck > weight) {
                        q.add(0);
                        answer++;
                    } else {
                        q.add(truck);
                        sum+=truck;
                        answer++;
                        break;
                    }
                }
            }
        }
         answer += bridge_length; // 마지막 트럭 통과시간
        
        return answer;
    }
}