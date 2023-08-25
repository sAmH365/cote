
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int line = Integer.parseInt(bf.readLine());
        String[] ex = new String[line];
        for (int i=0;i<ex.length;i++) {
            ex[i] = bf.readLine();
        }

        for (int i=0; i<ex.length; i++) {
            String[] strs = ex[i].split(" ");

            for (int j=0;j< strs.length; j++) {
                String s = strs[j];

                for (int k=s.length() - 1; k>=0; k--) {
                    result.append(s.charAt(k));
                }
                if (j != strs.length-1) result.append(" ");
            }
            if(i != ex.length-1)result.append("\n");
        }

        System.out.println(result);
    }
}
