import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int time = 0;

    Map<Integer, List<Character>> numPad = new HashMap<>();
    numPad.put(2, List.of(new Character[]{'A', 'B', 'C'}));
    numPad.put(3, List.of(new Character[]{'D', 'E', 'F'}));
    numPad.put(4, List.of(new Character[]{'G', 'H', 'I'}));
    numPad.put(5, List.of(new Character[]{'J', 'K', 'L'}));
    numPad.put(6, List.of(new Character[]{'M', 'N', 'O'}));
    numPad.put(7, List.of(new Character[]{'P', 'Q', 'R', 'S'}));
    numPad.put(8, List.of(new Character[]{'T', 'U', 'V'}));
    numPad.put(9, List.of(new Character[]{'W', 'X', 'Y', 'Z'}));

    for (int i=0; i<input.length(); i++) {
      char letter = input.charAt(i);

      for (int j=2; j<=9; j++) {
        if (numPad.get(j).contains(letter)) {
          time = time + (j + 1);
          break;
        }
      }
    }

    System.out.println(time);
  }
}