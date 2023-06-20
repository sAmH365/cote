import java.util.Arrays;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        int[] startTimes = new int[book_time.length];
        int[] endTimes = new int[book_time.length];
        
        for (int i = 0; i < book_time.length; i++) {
            String[] time = book_time[i];
            String[] startTimeParts = time[0].split(":");
            String[] endTimeParts = time[1].split(":");
            
            int startHour = Integer.parseInt(startTimeParts[0]);
            int startMinute = Integer.parseInt(startTimeParts[1]);
            int endHour = Integer.parseInt(endTimeParts[0]);
            int endMinute = Integer.parseInt(endTimeParts[1]);
            
            startTimes[i] = startHour * 60 + startMinute;
            endTimes[i] = (endHour * 60 + endMinute) + 10;
        }
        
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);
        
        int roomCount = 0;
        int endIndex = 0;
        
        for (int i = 0; i < book_time.length; i++) {
            if (startTimes[i] < endTimes[endIndex]) {
                roomCount++;
            } else {
                endIndex++;
            }
        }
        
        return roomCount;
    }
}