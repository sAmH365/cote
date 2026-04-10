import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] m1 = {1, 2, 3, 4, 5};  // length % 10
        int[] m2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] m3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] m1Ans = new int[answers.length];
        int[] m2Ans = new int[answers.length];
        int[] m3Ans = new int[answers.length];
        
        for (int i = 0; i < m1Ans.length; i++) {
            m1Ans[i] = m1[i % m1.length];
            m2Ans[i] = m2[i % m2.length];
            m3Ans[i] = m3[i % m3.length];
        }
        
        
        Map<Integer, Integer> map = new HashMap();// {1번: 점수}

        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        
        for (int i = 0; i < answers.length; i++) {
            // 정답
            int ans = answers[i];

            if (m1Ans[i] == ans) {
                map.put(1, map.get(1) + 1);
            }
            if (m2Ans[i] == ans) {
                map.put(2, map.get(2) + 1);
            }
            if (m3Ans[i] == ans) {
                map.put(3, map.get(3) + 1);
            }
        }
        
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        
        int m1Scroe = map.get(1);
        int m2Score = map.get(2);
        int m3Score = map.get(3);
        
        int max = Math.max(m1Scroe, Math.max(m2Score, m3Score));
        
        List<Integer> results = new ArrayList();
        if (m1Scroe == max) {
            results.add(1);
        }
        if (m2Score == max) {
            results.add(2);
        }
        if (m3Score == max) {
            results.add(3);
        }
         
        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}