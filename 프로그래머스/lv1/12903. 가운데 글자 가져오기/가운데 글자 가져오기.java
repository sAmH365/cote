class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        
        if (s.length() % 2 == 0) {
            answer = "" + chars[(s.length() / 2) - 1] + chars[s.length() / 2];
        } else {
            answer = "" + chars[s.length() / 2];
        }
        
        return answer;
    }
}