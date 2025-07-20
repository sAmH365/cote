import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

  public static void main(String[] args)  throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int answer = 0;


    Integer N = Integer.parseInt(br.readLine());

    Integer[] w = new Integer[N];

    for (int i = 0; i < N; i++) {
      w[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(w, Collections.reverseOrder());

    // 15 15 10 2
    // 각 로프마다 최대로 버틸수있는 중량 => 제일 작은 무게 * 걸린 로프 개수
    // 2 * 4 => 8

    // 로프 다 사용 안해도 됨
    // 15 15 10 2
    // 10 * 3 => 30

    for (int i = 0; i < w.length; i++) {
      int weight = w[i] * (i + 1);

      answer = Math.max(answer, weight);
    }

    System.out.println(answer);
  }
}