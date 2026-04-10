import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] board = new int[n];
        Arrays.fill(board, 1);
        
        for (int i = 0; i < section.length; i++) {
            int idx = section[i] - 1;
            board[idx] = 0;
        }
        

        
        // [1, 0, 1, 1, 1, 1, 1, 1]
        // for (int i : board) {
        //     System.out.print(i + " ");
        // }
        
        // int idx = check(board);
        // while(idx != -1) {
        //     paint(board, start, end);
        //     count++;
        //     idx = check(board);
        //     System.out.println(idx);
        //     start = idx;
        //     end = start + m - 1;
        // }
        
        int count = 0;
        int start = section[0] - 1; // 1
        int end = start + m - 1; // 4
        
        for (int i = 0; i < section.length; i++ ){
            paint(board, start, end);
            count++;
            
            int ck = check(board);
            // System.out.println(ck);
            // for (int b : board) {
            //     System.out.print(b + " ");
            // }
            // System.out.println();
            if (ck == -1) break;
            
            start = ck;
            end = start + m - 1;
        }
        
        return count;
    }
    
    public void paint(int[] board, int start, int end) {    
        for (int i = start; i <= end; i++) {
            if (i >= board.length) return;
            
            board[i] = 1;
        }
    }
    
    public int check(int[] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i] != 1) return i;
        }
        
        return -1; // 끝
    }
}