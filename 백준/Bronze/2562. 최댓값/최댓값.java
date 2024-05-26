import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        int[] numBack = new int[9];

        int max = 0;
        int index = 0;


        for (int i=0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i=0; i<nums.length; i++) {
            numBack[i] = nums[i];
        }

        Arrays.sort(nums);

        max = nums[nums.length - 1];

        for (int i=0; i<numBack.length; i++) {
            if (max == numBack[i]) {
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
