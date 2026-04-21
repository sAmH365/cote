class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 긴쪽이 가로가 되도록 눕히기
        for (int i = 0; i < sizes.length; i++) {
            int[] card = sizes[i];
            int max = Math.max(card[0], card[1]);
            int min = Math.min(card[0], card[1]);
            card[0] = max;
            card[1] = min;
        }
        
        // 가로중에 제일긴 값 * 세로중에 제일 긴값
        int wMax = 0;
        int hMax = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int[] card = sizes[i];
            int w = card[0];
            int h = card[1];
            
            if (w >= wMax) {
                wMax = w;
            }
            if (h >= hMax) {
                hMax = h;
            }
        }
    
        answer = wMax * hMax;
        return answer;
    }
}