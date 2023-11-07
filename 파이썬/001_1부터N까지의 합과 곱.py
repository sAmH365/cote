## 1부터 100까지의 합
print('1부터 100까지의 합')
result = 0
for i in range(1, 101):
    result += i
print(result)
print()

## 1부터 10까지의 곱
print('1부터 10까지의 곱')
result = 1
for i in range(1, 11):
    result *= i
print(result)
print()


# 시그마 공식 : n * (n+1) // 2
print('시그마 공식 : n * (n+1) // 2')
result = 0
n = 100
x = n * (n+1) // 2
print(x)
print()
