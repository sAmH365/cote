import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        // {스테이지번호 : 실패율}
        Map<Integer, Double> map = new HashMap();
        
        for (int i = 1; i <= N; i++) {
            int currentStage = i;
            int failPlayer = 0;
            int player = 0;
            
            for (int j = 0; j < stages.length; j++) {
                int currentPlayer = stages[j];
                if (currentPlayer >= currentStage) player++;
                
                if (currentPlayer >= currentStage && currentPlayer < currentStage + 1) {
                    failPlayer++;
                }
            }
            map.put(currentStage, failRate(failPlayer, player));
        }
        
        answer = sort(map);
        
        
        return answer;
    }
    
    public double failRate(int failPlayer, int player) {
        if (player == 0) return 0.0;
        return failPlayer / (double)player;
    }
    
    public int[] sort(Map<Integer,Double> map) {
        // 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열
        // 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다
        int[] result = new int[map.size()];
        
       List<Map.Entry<Integer, Double>> entryList = new LinkedList(map.entrySet());
        
        entryList.sort((o1, o2) -> {
         if (o1.getValue().equals(o2.getValue())) {
             return o1.getKey().compareTo(o2.getKey());
         } else {
             return o2.getValue().compareTo(o1.getValue());       
         }
        });
        
        for (int i = 0; i < result.length; i++) {
            result[i] = entryList.get(i).getKey();
        }
        
        return result;
    }
}