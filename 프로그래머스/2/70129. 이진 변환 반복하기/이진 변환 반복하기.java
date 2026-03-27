import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int zeroCount = 0;
        int oneCount = 0;
        
        int totalZeroCount = 0; // 총 0의 개수
        int convertCount = 0; // 이진 변환 횟수
        
        while (true) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == '0') {
                    zeroCount++;
                    totalZeroCount++;
                } else {
                    oneCount++;
                }
            }
            
            if (s.equals("1")) { // 탈출조건
                return new int[]{convertCount, totalZeroCount};
            }
            
            s = Integer.toBinaryString(oneCount);
            convertCount++;
            zeroCount = 0;
            oneCount = 0;
        }
    }
}