
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int N = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);

        Queue<Integer> q = new LinkedList<>();

        for (int i=1; i<=N; i++) {
            q.offer(i);
        }

        while(q.size() != 1) {
            for (int i=0;i<K-1;i++) {
                q.offer(q.poll());
            }

            sb.append(q.poll() + ", ");
        }

        sb.append(q.poll() +">");

        System.out.println(sb);
    }
}
