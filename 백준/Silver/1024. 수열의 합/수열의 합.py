N, L = list(map(int, input().split()))
result = set()
def solve():
  for l in range(L, 101):
    tmp_sum = l * (l - 1) // 2 # 0 ~ l-1까지의 합, 등차수열 합공식

    remain = N - tmp_sum # 15

    if remain % l == 0:
      start = remain // l
      end = start + l

      if start >= 0:
        for i in range(start, end):
          print(i, end=' ')
        return
  print(-1)


solve()