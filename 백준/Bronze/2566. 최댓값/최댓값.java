import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] board = new int[9][9];
    for (int i=0; i<9; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int j=0;
      while(st.hasMoreElements()) {
        board[i][j] = Integer.parseInt(st.nextToken());
        j++;
      }
    }

    int x = 0;
    int y = 0;
    int max = 0;
    for (int i=0;i<board.length; i++) {
      for (int j=0;j<board[i].length; j++) {
        if (max <= board[i][j]) {
          max = board[i][j];
          x = i;
          y = j;
        }
      }
    }

    System.out.println(max);
    System.out.printf("%d %d", x + 1, y + 1);
  }
}
