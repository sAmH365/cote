import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         *
         * 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
         */

        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split(" ");

        int num = Integer.parseInt(inputs[0]);
        int formation = Integer.parseInt(inputs[1]);

        System.out.println(Integer.toString(num, formation).toUpperCase());
    }
}
