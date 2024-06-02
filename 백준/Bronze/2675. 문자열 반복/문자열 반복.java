import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<testCase; i++) { // 테스트케이스 만큼 반복
            StringBuilder sb = new StringBuilder();
            String[] inputs = sc.nextLine().split(" ");

            // 인풋을 반복횟수 + 주어진 문자열로 분리
            int repeatCnt = Integer.parseInt(inputs[0]);
            String[] strs = inputs[1].split(""); // 문자열을 배열로 나눔

            // 각 문자를 반복횟수만큼 반복해서 string builder에 추가
            for (String str : strs) {
                for (int j=0; j<repeatCnt; j++) {
                    sb.append(str);
                }
            }

            System.out.println(sb);
        }
    }
}
