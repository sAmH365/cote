import java.util.*;
import java.io.*;

public class Main {
  static int N, S;
  static int[] nums;
  static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input1 = br.readLine().split(" ");
    N = Integer.parseInt(input1[0]);
    S = Integer.parseInt(input1[1]);

    nums = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0 ; i < nums.length; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    // 공집합 제외 (S == 0일 때만)
    dfs(0, 0);

    if (S == 0) count--;

    System.out.println(count);
  }

  static void dfs(int idx, int sum) {
    if (idx == N) {
      if (sum == S) count++;
      return;
    }

    // 현재 원소를 포함
    dfs(idx + 1, sum + nums[idx]);

    // 현재 원소를 포함하지 않음
    dfs(idx + 1, sum);
  }
}