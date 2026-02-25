import sys

input = sys.stdin.readline

N, M = list(map(int, input().split()))

arr_input = [v for v in range(1, N + 1)]

result = []

def solve(start: int, current_arr: list):
  if len(current_arr) == M:
    print(*current_arr)
    return

  for i in range(start, N):
    current_arr.append(arr_input[i])
    solve(i + 1, current_arr)
    current_arr.pop()

solve(0, [])
