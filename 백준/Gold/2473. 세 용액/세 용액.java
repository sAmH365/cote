import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    // 세용액의 합을 구함
    // 0과의 거리를 구해서 가장 가까운 걸로 교체
    // 0과의 거리 -> 절대값 Math.abs()
    // n = 5000, 3중for면 -> n^3 -> 1200억
    // 2중 for -> 25000000

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    long[] nums = new long[N];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < nums.length; i++) {
      nums[i] = Long.parseLong(st.nextToken());
    }

    long tmp = Long.MAX_VALUE;
    long[] answer = new long[3];
    Arrays.sort(nums);


    // -97 -6 -2 6 98

    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      long sum = 0;

      while (left < right) {
        sum = nums[i] + nums[left] + nums[right];
        if (Math.abs(sum) < tmp) {
          tmp = Math.abs(sum);
          answer[0] = nums[i];
          answer[1] = nums[left];
          answer[2] = nums[right];
        }

        if (sum < 0) {
          left++;
        } else {
          right--;
        }
      }
    }

    Arrays.sort(answer);
    StringBuilder sb = new StringBuilder();

    for (int i = 0 ; i < 3; i++) {
      sb.append(answer[i] + " ");
    }

    System.out.println(sb.toString().trim());
  }
}