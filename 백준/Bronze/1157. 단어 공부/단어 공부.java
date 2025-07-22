import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String str = input.toLowerCase();

    // Map에 기본값 삽입
    Map<Character, Integer> strMap = new HashMap<>();
    for (char c : str.toCharArray()) {
      strMap.put(c, strMap.getOrDefault(c, 0) + 1);
    }

    // 최빈값 및 해당 알파벳 찾기
    int max = 0;
    char result = '?';
    for (Map.Entry<Character, Integer> entry : strMap.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        result = entry.getKey();
      } else if (entry.getValue() == max) {
        result = '?';
      }
    }

    System.out.println(Character.toUpperCase(result));
    }
  }

