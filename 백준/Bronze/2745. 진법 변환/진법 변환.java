import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         *
         * B진법 수 N
         * 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
         *
         * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
         *
         * ZZZZZ 36 ->
         */

        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split(" ");

        String str = inputs[0];
        int formation = Integer.parseInt(inputs[1]);

        System.out.println(Integer.parseInt(str, formation));
    }
}
