
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;

        while(line-- > 0) {
            int n = Integer.parseInt(bf.readLine());

            if (n > start) {
                for (int i=start+1; i<=n;i++) {
                    stack.push(i);
                    sb.append("+\n");
                }

                start = n;
            } else if(stack.peek() != n) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb);
    }
}
