import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         *
         * 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
         *
         * 첫 번째 숫자가 두 번째 숫자의 약수이다.
         * 첫 번째 숫자가 두 번째 숫자의 배수이다.
         * 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
         *
         * 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
         */

        Scanner sc = new Scanner(System.in);

        while(true) {
            String[] inputs = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(inputs[0]);
            int num2 = Integer.parseInt(inputs[1]);

            if (num1 == 0 && num2 == 0) break;

            if (num1 % num2 == 0) {
                System.out.println("multiple");
            } else if (num2 % num1 == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }


    }
}
