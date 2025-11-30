class Solution {
    public int[] solution(int n) {
        int size = 0;
        if (n % 2 != 0) {
            size = (n + 1) / 2;
        } else {
            size = n / 2;
        }
        
        int[] answer = new int[size];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = i + (i + 1);
        }
        
        return answer;
    }
}