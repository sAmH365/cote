import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        ArrayList<Integer> ar = new ArrayList<>();
        int count = 0;

        // N: 세로, M: 가로
        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);

        int[][] inputs = new int[N][M];

        // 입력 받아서 배열 저장
        for (int i=0;i<N;i++) {
            String[] s = bf.readLine().split(" ");
            for (int j=0; j<M; j++) {
                inputs[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int i=0;i<N;i++) {
            for (int j=0; j<M; j++) {
                if (inputs[i][j] != 0) {
                    ar.add(inputs[i][j]);
                } else if(ar.contains(1) && ar.contains(2)) {
                    count += check(ar) + 1;
                    ar.clear();
                } else if(ar.contains(1) || ar.contains(2)) {
                    count += 1;
                    ar.clear();
                }
            }

            // 0 을 만나지 못하고 행이 끝난 경우 ->  1 0 0 1 2
            if (ar.contains(1) && ar.contains(2)) {
                count += check(ar) + 1;
            } else if(!ar.isEmpty()) {
                count +=1;
            }

            // 다음행 시작되니깐 초기화
            ar.clear();
        }

        System.out.println(count);
    }

    /**
     * 1 1 2 2 1 2 1  one: 3 two: 2  2 + 1
     * 1 1 0 2 2 1 1
     * 0 0 0 0 0 0 0
     */

    private static int check(ArrayList<Integer> ar) {
        int one = 0; // 1 chunk
        int two = 0; // 2 chunk

        int prev = 0; // 이전 색상
        int now; // 현재 색상

        for (int i=0; i<ar.size(); i++) {
            now = ar.get(i);

            // 이전 색상과 다를 때만 카운트
            if (prev != now) {
                if (now == 1) one++;
                else two++;
            }

            prev = now;
        }

        return Math.min(one, two);
    }
}
