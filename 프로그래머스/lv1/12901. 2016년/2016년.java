import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        LocalDate ld = LocalDate.of(2016, a, b);
        answer = ld.getDayOfWeek().toString().substring(0,3);
        
        return answer;
    }
}