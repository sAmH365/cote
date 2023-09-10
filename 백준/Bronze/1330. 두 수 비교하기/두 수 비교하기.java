import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");

        if (Integer.parseInt(input[0]) > Integer.parseInt(input[1])) System.out.println(">");
        else if (Integer.parseInt(input[0]) < Integer.parseInt(input[1])) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}