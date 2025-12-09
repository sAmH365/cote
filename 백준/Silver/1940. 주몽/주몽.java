import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int nums[] = new int[N];
    for (int i = 0; i < N; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    int left = 0, right = nums.length - 1, count = 0, sum = 0;

    Arrays.sort(nums);

    while(left < right) {
      sum = nums[left] + nums[right];

      if (sum == M) {
        count++;
        left++;
      } else if (sum < M) {
        left++;
      } else {
        right--;
      }
    }

    System.out.println(count);
  }
}