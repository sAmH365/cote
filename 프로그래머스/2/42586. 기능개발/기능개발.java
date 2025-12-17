import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    // 95, 90, 99, 99, 80, 99   speeds: 1, 1, 1, 1, 1, 1
    // 1. 각 진도마다 몇일 걸리지 구하기 -> [5, 10, 1, 1, 20, 1]
    int[] days = getDayEachProgress(progresses, speeds);
    System.out.println("Days::");
    for (int i = 0; i < days.length; i++) {
      System.out.print(days[i] + " ");
    }
    System.out.println();
    // 2. 배포일 찾아서 묶기
    return findDeployChunk(days);
    }
    
    private int[] getDayEachProgress(int[] progresses, int[] speeds) {
    int[] days = new int[progresses.length];

    for (int i = 0; i < days.length; i++) {
      int remain = 100 - progresses[i];
      double ceil = Math.ceil((double) remain / speeds[i]);
      days[i] = (int) ceil;
    }

    return days;
  }

  private int[] findDeployChunk(int[] days) {
    int[] answer = new int[days.length];

    int targetDay = days[0];
    int count = 1;
    int j = 0;

    for (int i = 1; i < days.length; i++) {
      if (targetDay >= days[i]) {
        count++;
      } else {
        targetDay = days[i];
        answer[j++] = count;
        count = 1;
      }
    }

    answer[j] = count;

    int end = answer.length - 1;
    while (end >= 0 && answer[end] == 0) {
      end--;
    }

    return Arrays.copyOf(answer, end + 1);
  }
}