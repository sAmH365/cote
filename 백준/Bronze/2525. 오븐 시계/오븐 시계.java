import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때,
         * 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
         *
         * 14 30   ->  14 50
         * 20
         *
         * 23 58 , 63 => 1 1
         *
         * 14 30 ->   17 40
         * 190(3시간 10분)  -> 190 / 60 == 3 ,  190 % 60 == 10
         */

        Scanner sc = new Scanner(System.in);
        String[] currentTimeStrs = sc.nextLine().split(" ");

        int currentH = Integer.parseInt(currentTimeStrs[0]);
        int currentM = Integer.parseInt(currentTimeStrs[1]);
        int requiredMin = sc.nextInt();

        int plusH = requiredMin / 60;
        int plusM = requiredMin % 60;

        int resultH = currentH + plusH;
        int resultM = currentM + plusM;

        if (resultM >= 60) {
            resultH += 1;
            resultM -= 60;
        }

        if (resultH >= 24) {
            resultH -= 24;
        }

        System.out.println(resultH + " " + resultM);

    }
}
