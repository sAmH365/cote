import java.util.HashMap;

public class Solution {
    public int solution(int[] topping) {
        int fairCutCount = 0;
        int n = topping.length;

        HashMap<Integer, Integer> leftCounts = new HashMap<>();
        HashMap<Integer, Integer> rightCounts = new HashMap<>();

        for (int t : topping) {
            rightCounts.put(t, rightCounts.getOrDefault(t, 0) + 1);
        }

        int leftUnique = 0, rightUnique = rightCounts.size();

        for (int i = 0; i < n - 1; i++) {
            int t = topping[i];
            // Move topping from rightCounts to leftCounts
            leftCounts.put(t, leftCounts.getOrDefault(t, 0) + 1);
            rightCounts.put(t, rightCounts.get(t) - 1);

            if (leftCounts.get(t) == 1) {
                leftUnique++;
            }
            if (rightCounts.get(t) == 0) {
                rightUnique--;
            }

            if (leftUnique == rightUnique) {
                fairCutCount++;
            }
        }
        return fairCutCount;
    }
}