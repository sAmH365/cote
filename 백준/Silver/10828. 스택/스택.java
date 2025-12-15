import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  static List<Integer> stack = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i <N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int tokenCnt = st.countTokens();
      if (tokenCnt > 1) {
        // push
        st.nextToken();
        push(Integer.parseInt(st.nextToken()));
      } else {
        String cmd = st.nextToken();

        switch (cmd) {
          case "pop":
            pop();
            break;
          case "size":
            size();
            break;
          case "empty":
            empty();
            break;
          case "top":
            top();
            break;
        }
      }
    }
  }

  static void push(int x) {
    stack.add(x);
  }

  static void pop() {
    if (stack.isEmpty()) {
      System.out.println(-1);
      return;
    }
    int idx = stack.size() - 1;
    System.out.println(stack.get(idx));
    stack.remove(idx);
  }

  static void size() {
    System.out.println(stack.size());
  }

  static void empty() {
    int isEmpty = stack.isEmpty() ? 1 : 0;
    System.out.println(isEmpty);
  }

  static void top() {
    if (stack.isEmpty()) {
      System.out.println(-1);
      return;
    }
    System.out.println(stack.get(stack.size() - 1));
  }

}
