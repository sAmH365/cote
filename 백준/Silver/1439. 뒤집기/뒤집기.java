import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String input = br.readLine();

      int count0 = 0;
      int count1 = 0;

      char prev = input.charAt(0);
      if (prev == '0') count0++;
      else count1++;

      for (int i = 0; i < input.length(); i++) {
        char curr = input.charAt(i);
        if (curr != prev) {
          if (curr == '0') count0++;
          else count1++;
          prev = curr;
        }
      }

      System.out.println(Math.min(count0, count1));
    }
  }

