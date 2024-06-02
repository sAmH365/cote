import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = sc.nextLine().split("");

//        System.out.println((int)'a' - 97);

        int[] alphabet = new int[26];
        int[] flag = new int[26];

        Arrays.fill(alphabet, -1);

        for (int i=0; i<word.length; i++) {
            char c = word[i].charAt(0);
            if (flag[c - 97] == 0) {
                flag[c - 97] = 1;
                alphabet[c - 97] = i;
            }
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}
