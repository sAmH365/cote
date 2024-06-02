import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        String[] A = inputs[0].split(""); // 7, 3, 4
        String[] B = inputs[1].split(""); // 893

        StringBuilder aSb = new StringBuilder();
        StringBuilder bSb = new StringBuilder();

        for(int i = A.length - 1; i >= 0; i--) {
            aSb.append(A[i]);
            bSb.append(B[i]);
        }

        int intA = Integer.parseInt(aSb.toString());
        int intB = Integer.parseInt(bSb.toString());

        System.out.println(Math.max(intA, intB));
    }
}
