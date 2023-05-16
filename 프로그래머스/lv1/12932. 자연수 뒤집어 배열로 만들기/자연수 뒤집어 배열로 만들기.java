class Solution {
    public int[] solution(long n) {
        String tmp = n + "";
        String[] strs = tmp.split("");

        int[] answer = new int[strs.length];
        
        for (int i= 0; i<answer.length;i++) {
            answer[i] = Integer.parseInt(strs[strs.length-1-i]);
        }
        
        return answer;
    }
}