import sys

inputs = sys.stdin.readline

N = int(inputs())
paper = [list(map(int, inputs().split())) for _ in range(N)]

minus_one_cnt = 0
zero_cnt = 0
one_cnt = 0

def check(r, c, n):
  mark = paper[r][c]

  for i in range(r, r + n):
    for j in range(c, c + n):
      if paper[i][j] != mark:
        return False
  return True

def solve(r, c, n):
  global minus_one_cnt, zero_cnt, one_cnt

  if check(r, c, n):
    if paper[r][c] == -1:
      minus_one_cnt += 1
    elif paper[r][c] == 0:
      zero_cnt += 1
    else:
      one_cnt += 1
    return

  size = n // 3

  solve(r, c, size)
  solve(r, c + size, size)
  solve(r, c + 2 * size, size)

  solve(r + size, c, size)
  solve(r + size, c + size, size)
  solve(r + size, c + 2 * size, size)

  solve(r + 2 * size, c, size)
  solve(r + 2 * size, c + size, size)
  solve(r + 2 * size, c + 2 * size, size)

solve(0, 0, N)

print(minus_one_cnt)
print(zero_cnt)
print(one_cnt)