import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        Arrays.sort(people);

        int start = 0;
        int end = people.length - 1;
        int answer = 0;
        
        while (start <= end) {
            answer++;

            if (people[start] + people[end] <= limit) {
                start++;
            }

            end--;
        }
        
        // end 인덱스통해서 보트 탑승여부 처리
        
        return answer;
    }
}