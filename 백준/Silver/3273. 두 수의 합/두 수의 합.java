import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String numInput = br.readLine();
    int x = Integer.parseInt(br.readLine());
    int count = 0;

    String[] s = numInput.split(" ");
    int[] intArr = new int[n];
    for (int i = 0; i < n; i++) {
      intArr[i] = Integer.parseInt(s[i]);
    }

    // 정렬 NlogN
    Arrays.sort(intArr);
    // 투포인터 N
    int left = 0, right = intArr.length - 1, sum = 0;

    while (left < right) {
      sum = intArr[left] + intArr[right];
      if (sum == x) {
        count++;
        left++;
      } else if(sum < x) {
        left++;
      } else {
        right--;
      }
    }

    System.out.println(count);
  }
}