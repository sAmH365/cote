import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        // 1. 각 작업의 남은 일수를 계산하여 큐에 삽입
        for (int i = 0; i < progresses.length; i++) {
            // (100 - 현재진도) / 속도 를 올림 처리
            int remain = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            q.offer(remain);
        }

        // 2. 큐가 빌 때까지 배포 그룹 만들기
        while (!q.isEmpty()) {
            int firstDeployDay = q.poll(); // 현재 배포 그룹의 기준일 (가장 앞선 작업)
            int count = 1; // 이번 배포에 포함된 기능 개수

            // 기준일보다 빨리 끝나는 뒤의 작업들을 모두 포함
            while (!q.isEmpty() && q.peek() <= firstDeployDay) {
                q.poll();
                count++;
            }
            
            answer.add(count);
        }

        // List를 배열로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}