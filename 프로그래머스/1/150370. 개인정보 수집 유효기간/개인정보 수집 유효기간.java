import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[100];
      Map<String, Integer> termsMap = new HashMap<>();
      Map<String, String> privaciesMap = new HashMap<>();

      for (String s : terms) {
        String[] split = s.split(" ");
        termsMap.put(split[0], Integer.parseInt(split[1]));
      }

      // 약관별 만료일
      int i = 0;
      int num = 1;
      for (String pri : privacies) {
        String[] split = pri.split(" ");
        String joinDate = split[0];
        String privacy = split[1];

        Integer validMonth = termsMap.get(privacy);
        Date date = new Date(joinDate);
        Date todayDate = new Date(today);

        String expireDate = date.addMonth(joinDate, validMonth);

        // System.out.println("privacy : " + privacy + " today :" + todayDate + "  exDate : " + expireDate);
        if (todayDate.isAfter(expireDate)) {
          answer[i] = num;
        }

        i++;
        num++;
      }

      return Arrays.stream(answer).filter(v -> v != 0).toArray();
    }
    
    static class Date {
    int year;
    int month;
    int day;

    public Date(String date) {
      String[] split = date.split("\\.");
      this.year = Integer.parseInt(split[0]);
      this.month = Integer.parseInt(split[1]);
      this.day = Integer.parseInt(split[2]);
    }

    public String addMonth(String date, int addMonth) {
      String[] split = date.split("\\.");
      int year = Integer.parseInt(split[0]);
      int month = Integer.parseInt(split[1]);
      int day = Integer.parseInt(split[2]);

      month = month + addMonth;
      while (month > 12) {
        year += 1;
        month -= 12;
      }

      return year + "." + padding(month) + "." + padding(day);
    }

    public String padding(int value) {
      return String.format("%02d", value);
    }

    public String toString() {
      return getDate();
    }

    public String getDate() {
      return year + "." + month + "." + day;
    }

    public boolean isAfter(String expireDate) {
      String[] split = expireDate.split("\\.");
      int exYear = Integer.parseInt(split[0]);
      int exMonth = Integer.parseInt(split[1]);
      int exDay = Integer.parseInt(split[2]);

      if (year > exYear) {
        return true;
      } else if (year == exYear) {
        if (month > exMonth) {
          return true;
        } else  if (month == exMonth) {
          return day >= exDay;
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
  }
}