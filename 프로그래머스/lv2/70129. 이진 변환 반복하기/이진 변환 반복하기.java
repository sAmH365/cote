class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;

        while(!s.equals("1")) {
            int c = s.length();
            s = s.replace("0","");
            count++;
            zeroCount += (c - s.length());
            s = Integer.toBinaryString(s.length());
        }
        int[] answer = {count, zeroCount};
        
        return answer;
    }
}