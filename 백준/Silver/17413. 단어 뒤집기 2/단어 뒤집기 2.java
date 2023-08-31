
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split("");
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i< input.length; i++) {
            while(input[i].equals("<")) {
                while(!stack.isEmpty())
                    sb.append(stack.pop());

                while(!input[i].equals(">")) {
                    sb.append(input[i++]);
                }

                if (input[i].equals(">") && i != input.length - 1) {
                    sb.append(">");
                    i++;
                }
            }

            if (input[i].equals(" ")) {
                while(!stack.isEmpty()) sb.append(stack.pop());
                sb.append(" ");
            } else {
                stack.push(input[i]);
            }

            if (i == input.length - 1) {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        System.out.println(sb);
    }
}
