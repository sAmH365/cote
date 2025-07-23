import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

  static int M, N;


  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      N = Integer.parseInt(br.readLine());
      Map<Integer, Integer> havingCards = new HashMap<>();
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < N; i++) {
        int number = Integer.parseInt(st.nextToken());

        havingCards.put(number, havingCards.getOrDefault(number, 0) + 1);
      }

      M = Integer.parseInt(br.readLine());
      int[] answer = new int[M];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < M; i++) {
        int number = Integer.parseInt(st.nextToken());
        answer[i] = havingCards.getOrDefault(number, 0);
      }


      for (int a : answer) {
        System.out.print(a + " ");
      }
    }
  }