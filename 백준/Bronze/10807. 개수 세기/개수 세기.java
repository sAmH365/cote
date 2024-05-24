import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
         */

        Scanner sc = new Scanner(System.in);

        int line = Integer.parseInt(sc.nextLine());
        String[] inputs = sc.nextLine().split(" ");
        int findNum = Integer.parseInt(sc.nextLine());
        
        int[] nums = new int[inputs.length];
        for (int i=0; i< inputs.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }
        
        int result = 0;

        for (int num : nums) {
            if (num == findNum) result += 1;
        }

        System.out.println(result);
    }
}
