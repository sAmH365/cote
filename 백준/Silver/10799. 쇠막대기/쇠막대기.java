import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split("");
        Stack<String> stack = new Stack<>();

        int result = 0;

        stack.push(input[0]);
        for (int i=1; i<input.length; i++) {
            if (input[i].equals("(")) {
                stack.push("(");
                continue;
            }

            if (input[i].equals(")")) {
                stack.pop();

                if (input[i-1].equals("(")) {
                    result += stack.size();
                } else {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
