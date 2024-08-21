import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P92 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String arrayInput = sc.nextLine();
    int n, m, k;
    int count = 0;
    int sum = 0;
    int index = 0;

    String[] inputs = input.split(" ");
    String[] arrayInputs = arrayInput.split(" ");

    n = Integer.parseInt(inputs[0]);
    m = Integer.parseInt(inputs[1]);
    k = Integer.parseInt(inputs[2]);

    Integer[] array = new Integer[n];

    for (int i=0; i<array.length; i++) {
      array[i] = Integer.parseInt(arrayInputs[i]);
    }

    Arrays.sort(array, Collections.reverseOrder());

    for (int i=0; i < m; i++) {
      if (count < k) {
        sum += array[index];
        count++;
      } else {
        sum += array[index + 1];
        count = 0;
      }
    }

    System.out.println(sum);
  }

}
