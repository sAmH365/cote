class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] strs = phone_number.split("");
        
        for (int i=strs.length - 5; i >= 0 ;i--) {
            strs[i] = "*";
        }
        
        for (String s : strs) answer += s;
        
        return answer;
    }
}