import sys

inputs = sys.stdin.readline

N = int(inputs())
paper = [ list(map(int, inputs().split())) for _ in range(N)]

white_color = 0
white_cnt, blue_cnt = [0, 0]

def check(r, c, n):
  color = paper[r][c] # 기준 컬러

  for i in range(r, r + n):
    for j in range(c, c + n):
      if paper[i][j] != color:
        return False
  return True

def solve(r, c, n):
  global white_cnt, blue_cnt

  m = n // 2

  if check(r, c, n):
    if paper[r][c] == white_color:
      white_cnt += 1
    else:
      blue_cnt += 1
    return

  solve(r, c, m)
  solve(r, c + m, m)
  solve(r + m, c, m)
  solve(r + m, c + m, m)

solve(0, 0, N)

print(white_cnt)
print(blue_cnt)