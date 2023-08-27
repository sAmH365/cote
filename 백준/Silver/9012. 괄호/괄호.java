
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(bf.readLine());
        Stack<String> stack = new Stack<>();
        String[] result = new String[line];
        int count = 0;

        for (int i=0; i<line; i++) {
            String[] ps = bf.readLine().split("");

            for (int j=0; j<ps.length; j++) {
                if (ps[j].equals("(")) {
                    count++;
                } else if (ps[j].equals(")") && count == 0) {
                    count--;
                    break;
                } else count--;
            }

            if (count != 0) System.out.println("NO");
            else System.out.println("YES");

            count = 0;
        }
    }
}
