import sys

N, M = [9, 9]
inputs = sys.stdin.readline

arr = [ list(map(int, inputs().split())) for _ in range(N)]
max = float('-inf')
idx = []

for i in range(N):
  for j in range(M):
    if arr[i][j] >= max:
      max = arr[i][j]
      idx = [i + 1, j + 1]

print(max)
print(*idx)
