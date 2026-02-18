import sys

inputs = sys.stdin.readline

N = int(inputs())
arr = [list(map(int, inputs().split())) for _ in range(N)]

for el in arr:
    print(sum(el))