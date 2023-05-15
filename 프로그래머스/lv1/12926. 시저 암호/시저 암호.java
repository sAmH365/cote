class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        char[] tmp = new char[chars.length];

        // A~Z 65 ~ 90
        // a~z 97 ~ 122
        for (int i=0; i< chars.length; i++) {
            int cal = chars[i] + n;

            if (chars[i] != ' ') {
                if (chars[i] >= 65 && chars[i] <= 90) {
                    if (cal > 90) cal -= 26;
                } else if (chars[i] >= 97 && chars[i] <= 122) {
                    if (cal > 122) cal -= 26;
                }
                tmp[i] = (char) cal;
            }
        }
        
        for (int i=0; i < tmp.length; i++) {
            if (tmp[i] == '\u0000') {
                answer += " ";
            } else {
                answer += (tmp[i]+"");
            }
        }
        
        return answer;
    }
}