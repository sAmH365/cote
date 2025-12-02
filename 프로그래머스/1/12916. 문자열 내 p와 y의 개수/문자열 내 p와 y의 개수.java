class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] chars = s.toCharArray();
        int pCount = 0;
        int yCount = 0; 
        
        for (char ch : chars) {
            if (ch=='p' || ch=='P') {
                pCount++;
            } else if (ch == 'y' || ch == 'Y') {
                yCount++;
            }
        }
        
        if (pCount == yCount) answer = true;
        else answer = false;

        return answer;
    }
}