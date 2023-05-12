import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = Integer.parseInt(sc.nextLine());
        int realPrice = 0;
        int n = Integer.parseInt(sc.nextLine());
        int [][] arr = new int[n][2];

        for (int i=0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

        for (int i=0; i< arr.length; i++) {
            realPrice += arr[i][0] * arr[i][1];
        }

        if (totalPrice == realPrice) System.out.println("Yes");
        else System.out.println("No");
    }
}