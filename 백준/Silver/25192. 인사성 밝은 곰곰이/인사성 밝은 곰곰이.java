import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> userSet = new HashSet<>();

        int log = Integer.parseInt(sc.nextLine());
        int result = 0;


        for (int i=0; i<log; i++) {
            String input = sc.nextLine();

            if (!userSet.contains(input) && !input.equals("ENTER")) {
                userSet.add(input);
                result++;
            }

            if (input.equals("ENTER")) {
                userSet.clear();
            }
        }

        System.out.println(result);
    }
}
