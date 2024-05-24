import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
         */

        Scanner sc = new Scanner(System.in);

        int caseCnt = sc.nextInt();
        sc.nextLine();

        String[] strs =  new String[caseCnt];

        for (int i=0; i<strs.length; i++) {
            strs[i] = sc.nextLine();
        }

        for (String str : strs) {
            String[] inputs = str.split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            System.out.println(a + b);
        }
    }
}