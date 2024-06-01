import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        int i = sc.nextInt();

        for (int j=0;j<s.length;j++) {
            if ((i-1 ) == j) System.out.println(s[i - 1]);
        }

    }
}
