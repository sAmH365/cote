import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] strs = input.split(" ");
        Long result = 0L;
        
        for (String str : strs) {
            result += Long.parseLong(str);
        }

        System.out.print(result);
    }
}
