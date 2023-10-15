class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;
        
        int cup = money / 5500;
        int changes = money - (cup * price );
        
        answer[0] = cup;
        answer[1] = changes;
        
        return answer;
    }
}