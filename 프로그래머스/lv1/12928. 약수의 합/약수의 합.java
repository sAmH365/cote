import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> ar = new ArrayList();
        for (int i=1; i<=n; i++) {
            if (n%i == 0) ar.add(i);
        }
        
        for (int el : ar) {
            answer += el;
        }
        
        return answer;
    }
}