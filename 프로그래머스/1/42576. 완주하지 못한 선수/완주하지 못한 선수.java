import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
    Map<String, Integer> partiMap = new HashMap<>();

    for (String parti : participant) {
      partiMap.put(parti, partiMap.getOrDefault(parti, 0) + 1);
    }

    for (String complete : completion) {
      partiMap.put(complete, partiMap.get(complete) - 1);
    }

    for (String key : partiMap.keySet()) {
      if (partiMap.get(key) != 0) {
        return key;
      }
    }

    return "";
    }
}