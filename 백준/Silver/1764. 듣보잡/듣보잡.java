import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    Map<String, Integer> answer = new HashMap<>();

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    for (int i = 0 ; i < N; i++) {
      String input = br.readLine();
      answer.put(input, answer.getOrDefault(input, 0) + 1);
    }

    for (int i = 0 ; i < M; i++) {
      String input = br.readLine();
      answer.put(input, answer.getOrDefault(input, 0) + 1);
    }

    List<String> filtered = new ArrayList<>(
        answer.keySet().stream().filter(k -> answer.get(k) >= 2).collect(Collectors.toList()));
    Collections.sort(filtered);

    System.out.println(filtered.size());
    for (String s : filtered) {
      System.out.println(s);
    }
  }
}