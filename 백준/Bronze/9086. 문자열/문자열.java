import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer testCase = Integer.parseInt(sc.nextLine());

        for (int i=0; i<testCase; i++) {
            String[] inputs = sc.nextLine().split("");
            System.out.println(inputs[0]+inputs[inputs.length - 1]);
        }
    }
}