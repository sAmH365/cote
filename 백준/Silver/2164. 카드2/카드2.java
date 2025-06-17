import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());

    Deque<Integer> dq = new LinkedList<>();

    for (int i=0; i<N; i++) {
      dq.addLast(i + 1);
    }

    System.out.println(solve(dq));
  }

  public static int solve(Deque<Integer> dq) {

    while(dq.size() > 1) {
      dq.removeFirst();
      dq.addLast(dq.removeFirst());
    }

    return dq.removeFirst();
  }
}
