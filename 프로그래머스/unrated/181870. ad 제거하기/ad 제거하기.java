import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> ar = new ArrayList<String>();
        
        for (int i=0; i<strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                ar.add(strArr[i]);
            } 
        }
        
        return ar.toArray(new String[ar.size()]);
    }
}