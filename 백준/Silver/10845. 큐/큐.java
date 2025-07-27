import java.util.*;
import java.io.*;
public class Main {
    static LinkedList<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int inputLine = Integer.parseInt(bf.readLine());

        for (int i=0;i<inputLine;i++) {
            String cmd = bf.readLine();
            if (cmd.startsWith("push")) {
                String[] s = cmd.split(" ");
                push(Integer.parseInt(s[1]));
            } else {
                switch(cmd) {
                    case "front": front();
                    break;
                    case "pop": pop();
                        break;
                    case "size": size();
                        break;
                    case "empty": empty();
                        break;
                    case "back": back();
                        break;
                }
            }
        }
    }

    static void push(int x) {
        queue.add(x);
    }

    static void pop() {
        if (!queue.isEmpty()) System.out.println(queue.pop());
        else System.out.println(-1);
    }

    static void size() {
        System.out.println(queue.size());
    }

    static void empty() {
        if (queue.size()==0) System.out.println(1);
        else System.out.println(0);
    }

    static void front() {
        if(!queue.isEmpty()) System.out.println(queue.getFirst());
        else System.out.println(-1);
    }

    static void back() {
        if (!queue.isEmpty()) System.out.println(queue.getLast());
        else System.out.println(-1);
    }
}
