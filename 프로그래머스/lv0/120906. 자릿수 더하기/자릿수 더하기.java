class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String tmp = n+"";
        
        for(int i=0; i<tmp.length(); i++) {
            answer += Integer.parseInt(tmp.substring(i,i+1));
        }
        
        return answer;
    }
}