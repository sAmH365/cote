class Solution {
    public int solution(int[] array) {
        int[] ints = new int[1001];
        int answer = 0;
        int max = -1;
        int maxIndex=0;
        int count = 0;
        
        for(int i=0;i<array.length;i++) {
            ints[array[i]]++;
        }
        
        for(int i=0; i<ints.length; i++) {
            if(ints[i] > max) {
                max = ints[i];
                maxIndex = i;
            }
        }
        
        for(int i=0; i<ints.length; i++) {
            if(ints[i] == max) count++;
        }
        
        if(count > 1) return -1;
        
        return maxIndex;
    }
}