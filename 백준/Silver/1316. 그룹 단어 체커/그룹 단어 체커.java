import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i = 0; i < N; i++) {
      String word = br.readLine();
      if (isGroupWord(word)) {
        count++;
      }
    }

    System.out.println(count);
  }

  static boolean isGroupWord(String word) {
    boolean[] visited = new boolean[26];
    char prev = 0;

    for (int i = 0; i < word.length(); i++) {
      char cur = word.charAt(i);

      if (cur != prev) {
        if (visited[cur - 'a']) {
          return false; // 이미 전에 등장했던 문자
        }

        visited[cur - 'a'] = true;
        prev = cur;
      }
    }

    return true;
  }
}
