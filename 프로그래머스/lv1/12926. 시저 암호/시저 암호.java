class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                ch += n;
                
                if (ch > 'Z') ch -= 26;
                
                answer += (ch+"");
            } else if (Character.isLowerCase(ch)) {
                ch += n;
                
                if (ch > 'z') ch -= 26;
                answer += (ch+"");
            } else {
                answer += " ";
            }
        }
        
        // String answer = new String(tmp);
        
        return answer;
    }
}