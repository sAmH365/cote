import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int totalSquare = brown + yellow;
        
        // totalSquare 약수 구하기
        // 세로는 3이상, i == 세로, j == 가로
        // (세로 - 2) * (가로 - 2) == yellow 개수
        
        for (int i=3; i < totalSquare; i++) {
            if (totalSquare % i == 0) {
                int j = totalSquare / i;
                
                if ((i - 2) * (j - 2) == yellow) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        
        
        
        
        return answer;
    }
}