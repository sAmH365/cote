N, M = list(map(int, input().split()))
num_arr = [v for v in range(1, N + 1)]

visited = [False] * N

def solve(arr, select_arr: list):
  if len(select_arr) == M:
    print(*select_arr)
    return

  for i, select in enumerate(arr):
    if not visited[i]:
      visited[i] = True
      select_arr.append(select)
      solve(arr, select_arr)
      visited[i] = False
      select_arr.pop()

solve(num_arr, [])