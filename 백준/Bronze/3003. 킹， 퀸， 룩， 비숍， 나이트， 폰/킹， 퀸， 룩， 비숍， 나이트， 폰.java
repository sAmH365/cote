import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
         */

        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");

        int[] inputs = Arrays.stream(strs).mapToInt(e -> {
            return Integer.parseInt(e);
        }).toArray();

        int[] fullPiece = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];

        for (int i=0; i<result.length; i++) {
            result[i] = fullPiece[i] - inputs[i];
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
