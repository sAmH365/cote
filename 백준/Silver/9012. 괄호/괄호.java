import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(bf.readLine());

    String inputStrs[] = new String[num];
    for (int i = 0; i<num; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      inputStrs[i] = st.nextToken();
    }

    for (String inputStr : inputStrs) {
      System.out.println(solve(inputStr));
    }
  }

  public static String solve(String s) {
    Stack<String> stack = new Stack<>();
    String[] splits = s.split("");

    for (String split : splits) {
      if (split.equals("(")) {
        stack.push(split);
      } else if (stack.empty()) {
        return "NO";
      } else {
        stack.pop();
      }
    }

    if (stack.empty()) {
      return "YES";
    } else {
      return "NO";
    }
  }
}
