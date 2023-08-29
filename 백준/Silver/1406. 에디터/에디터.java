
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<String> inputString = new LinkedList<>(List.of(bf.readLine().split("")));

        ListIterator<String> iter = inputString.listIterator();

        while (iter.hasNext()) {
            iter.next();
        }

        int cmdNum = Integer.parseInt(bf.readLine());

        for (int i = 0; i < cmdNum; i++) {
            String cmd = bf.readLine();
            if (cmd.startsWith("P")) {
                String[] s = cmd.split(" ");
                iter.add(s[1]);
            } else {
                switch (cmd) {
                    case "L":
                        if (iter.hasPrevious()) {
                            iter.previous();
                        }
                        break;
                    case "D":
                        if (iter.hasNext()) {
                            iter.next();
                        }
                        break;
                    case "B":
                        if (iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        break;
                }
            }
        }


        for (String s : inputString) {
            bw.write(s);
        }

        bw.flush();
        bw.close();
    }
}