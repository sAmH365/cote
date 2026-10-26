import java.util.*;

class Solution {
    int n, m;

    public int solution(String[] maps) {
      n = maps.length;
      m = maps[0].length();

      int[] startIdx = new int[2];
      int[] endIdx = new int[2];
      int[] leverIdx = new int[2];

      char[][] map = new char[n][m];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (maps[i].charAt(j) == 'S') {
            startIdx[0] = i;
            startIdx[1] = j;
          }

          if (maps[i].charAt(j) == 'E') {
            endIdx[0] = i;
            endIdx[1] = j;
          }

          if (maps[i].charAt(j) == 'L') {
            leverIdx[0] = i;
            leverIdx[1] = j;
          }

          map[i][j] = maps[i].charAt(j);
        }
      }

      // 레버찾기
      int leverTime = bfs(map, new boolean[n][m], startIdx, leverIdx);
      if (leverTime == -1) return -1;

      int endTime = bfs(map, new boolean[n][m], leverIdx, endIdx);
      if (endTime == -1) return -1;

      return leverTime + endTime;
    }

    public int bfs(char[][] map, boolean[][] visited, int[] startIdx, int[] targetIdx) {
      int[] dy = {-1, 1, 0, 0};
      int[] dx = {0, 0, -1, 1};

      Queue<int[]> queue = new ArrayDeque<>();
      queue.offer(new int[]{startIdx[0], startIdx[1], 0});
      visited[startIdx[0]][startIdx[1]] = true;

      while (!queue.isEmpty()) {
        int[] current = queue.poll();
        int y = current[0];
        int x = current[1];
        int time = current[2];
          
        if (y == targetIdx[0] && x == targetIdx[1]) {
            return time;
        }

        for (int i = 0; i < 4; i++) {
          int ny = y + dy[i];
          int nx = x + dx[i];

          if (ny < 0 || nx < 0 || ny >= n || nx >= m) {
            continue;
          }

          if (visited[ny][nx] || map[ny][nx] == 'X') {
            continue;
          }

          visited[ny][nx] = true;
          queue.offer(new int[]{ny, nx, time + 1});
        }
      }

      return -1;
    }
  }