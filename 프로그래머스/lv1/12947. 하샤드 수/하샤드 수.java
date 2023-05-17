class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] strs = (x + "").split("");
        int tmp = 0;
        
        for (String i : strs) tmp += Integer.parseInt(i);
        
        if (x % tmp == 0) answer = true;
            else answer = false;
        
        return answer;
    }
}