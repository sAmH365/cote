class Solution {
    
    boolean[] visited;
    int n;
    int[][] computers;
    
    public void dfs(int current) {
        visited[current] = true;
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == false && computers[current][i] == 1) {
                dfs(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        this.n = n;
        this.computers = computers;
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                answer++;
                dfs(i);
            }
        }
        return answer;
    }
}