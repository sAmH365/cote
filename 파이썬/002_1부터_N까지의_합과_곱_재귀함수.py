print('1부터 n까지의 합 - 재귀')
def f(n):
    if n <= 1:
        return 1
    else:
        return n + f(n-1)
n = 100
print(f(n))
print()

print('1부터 n까지의 곱 - 재귀')
def f(n):
    if n <= 1:
        return 1
    else:
        return n * (n-1)
n = 5
print(f(n))

