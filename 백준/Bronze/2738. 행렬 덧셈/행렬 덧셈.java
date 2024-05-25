import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
         *
         * [[1, 1, 1], [2, 2, 2], [0, 1, 0]]
         */

        Scanner sc = new Scanner(System.in);

        String[] strs = sc.nextLine().split(" ");

        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        int[][] result = new int[n][m];

        for (int i=0; i<a.length; i++) {
            String[] rows = sc.nextLine().split(" ");
            for (int j=0; j<a[i].length; j++) {
                a[i][j] = Integer.parseInt(rows[j]);
            }
        }
        for(int i=0; i<b.length; i++) {
            String[] rows = sc.nextLine().split(" ");
            for (int j=0; j<b[i].length; j++) {
                b[i][j] = Integer.parseInt(rows[j]);
            }
        }

        for(int i=0; i<result.length; i++) {
            for (int j=0; j<result[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i=0; i<result.length; i++) {
            for (int j=0; j<result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
