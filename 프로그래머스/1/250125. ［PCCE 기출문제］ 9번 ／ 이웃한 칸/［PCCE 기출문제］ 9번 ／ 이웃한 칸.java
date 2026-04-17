import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {0, 0, -1, 1}; // 상, 하, 좌, 우
        int[] dy = {-1, 1, 0, 0};
        
        String target = board[h][w];
        
        for (int k = 0; k < 4; k++) {
            int xCheck = w + dx[k];
            int yCheck = h + dy[k];
            
            if (xCheck > board[h].length - 1 || yCheck > board.length - 1
               || xCheck < 0 || yCheck < 0
               ) {
                continue;
            }
            
            String ref = board[h + dy[k]][w + dx[k]];
                    
            if (target.equals(ref)) answer++;
        }
        
        return answer;
    }
}