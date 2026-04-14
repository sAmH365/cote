import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int pointer = score.length - 1; // 11
        Arrays.sort(score);
        
        while (true) {
            pointer = pointer - m;
            
            if (pointer + 1 < 0) {
                break;
            }
            
            answer += (score[pointer + 1] * m);
        }
        
        
        return answer;
    }
}