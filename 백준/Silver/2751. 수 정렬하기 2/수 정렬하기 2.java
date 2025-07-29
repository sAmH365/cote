import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[] numbers = new int[N];
    for (int i = 0; i < N; i++) {
      numbers[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(numbers); // O(N log N)

    StringBuilder sb = new StringBuilder();
    for (int num : numbers) {
      sb.append(num).append('\n');
    }

    System.out.print(sb);
  }
}