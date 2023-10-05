import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        StringBuilder sb = new StringBuilder();

        String[] strs = bf.readLine().split("");


        for (int i=0; i< strs.length; i++) {
            char c = strs[i].charAt(0);
            int index = c - 97;
            alpha[index]++;
        }

        for (int i=0;i<alpha.length;i++) {
            if (i != alpha.length - 1) sb.append(alpha[i]+" ");
            else sb.append(alpha[i]);
        }

        System.out.println(sb);
    }
}