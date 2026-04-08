import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        Food[] foods = new Food[food.length - 1];
        
        // i 번째 음식 / 2 => 배치될 음식의 개수
        for (int i = 1; i < food.length; i++) {
            int foodNumber = i;
            int count = food[i];
            
            foods[i - 1] = new Food(foodNumber, count);
        }
        
        // Food -> [(1, 2), (2, 2), (3, 3)]
        
        for (int i = 0; i < foods.length; i++) {
            Food f = foods[i];
            
            for (int j = 0; j < f.validCount; j++) {
                answer.append(f.foodNumber);
            }
        }
        
        answer.append(0);
        
        for (int i = foods.length - 1; i >= 0; i--) {
            Food f = foods[i];
            
            for (int j = 0; j < f.validCount; j++) {
                answer.append(f.foodNumber);
            }
        }
        
        return answer.toString();
    }
    
    class Food {
        int foodNumber; // 1번 음식
        int validCount; // 1번 음식의 유효한 개수
        
        public Food(int foodNumber, int count) {            
            this.foodNumber = foodNumber;
            this.validCount = count / 2;
        }
    }
}