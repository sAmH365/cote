import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<strs.length; i++) {
            if(strs[i].length() == 0) sb.append(" ");
            else{
                sb.append(strs[i].substring(0,1).toUpperCase());
                sb.append(strs[i].substring(1, strs[i].length()).toLowerCase());
                sb.append(" ");
            }
        }
        
        if(s.substring(s.length() -1, s.length()).equals(" ")) return sb.toString();
        
        return sb.substring(0, sb.length() - 1).toString();
    }
}