import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strs = s.split("");
        
        boolean isWord = false;
        
        int j = 0;
        
        ArrayList<String> arr = new ArrayList();
        
        for (int i=0; i<strs.length; i++) {
            if (strs[i].equals(" ")) {
                isWord = false;
                arr.add(strs[i]);
            } else {
                isWord=true;
            }
            
            if (isWord) {
                if (j % 2 == 0) {
                    arr.add(Character.toUpperCase(strs[i].charAt(0)) + "");
                    j++;
                } else {
                    arr.add(Character.toLowerCase(strs[i].charAt(0)) + "");
                    j++;
                }
            } else {
                j = 0;
            }
        }
        
        for (String el : arr) {
            answer += el;
        }
        return answer;
    }
}