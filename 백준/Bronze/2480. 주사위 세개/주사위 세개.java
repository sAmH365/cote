import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
         * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
         * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
         */

        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int[] nums = new int[3];

        for (int i=0; i< inputs.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        int max = 0;
        int result = 0;

        if (nums[0] == nums[1]) {
            result = 1000 + nums[0] * 100;
            if (nums[0] == nums[2]) {
                result = 10000 + nums[0] * 1000;
            }

            System.out.println(result);
            return;
        } else if (nums[0] == nums[2]) {
            result = 1000 + nums[0] * 100;
            System.out.println(result);
            return;
        } else if (nums[1] == nums[2]) {
            result = 1000 + nums[1] * 100;
            System.out.println(result);
            return;
        }

        for (int i=0; i<3; i++) {
            if (nums[i] > max) max = nums[i];
        }

        result = max * 100;
        System.out.println(result);
    }
}
