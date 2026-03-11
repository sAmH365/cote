import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
    int answer = 1;
    Map<String, List<String>> clotheMap = new HashMap<>();

    for (String[] clotheInfos : clothes) {
      String category = clotheInfos[1];
      String clothe = clotheInfos[0];

      clotheMap.computeIfAbsent(category, k -> new ArrayList<>())
          .add(clothe);
    }

    for (String key : clotheMap.keySet()) {
      List<String> clothList = clotheMap.get(key);
      answer *= clothList.size() + 1;
    }

    return answer - 1;
    }
}