print('재귀함수 사례')
x = 0
for i in range(11):
    x += i
print(x)
print()
# while True:
#     if input("## ") == 'exit':
#         break
#     if input("## ") == 'hi':
#         print('hello world')
#     else:
#         continue
print('2진수 구하기 - 반복문')
# print(bin(11)[2:])
# print(oct(11)[2:])
# print(hex(11)[2:])
# x = int(input('2진수로 바꿀 숫자를 입력하세요: '))
# result = ''
# while True:
#     if x % 2 == 0:
#         result += '0'
#     else:
#         result += '1'
#     x = x // 2
#     if x == 1:
#         result += str(x)
#         print(result[::-1])
#         break
def getBin(input):
    if input < 2:
        return str(input)
    else:
        return str(getBin(input // 2)) + str(input % 2)
n = 11
print(getBin(n))
print()

print('문자열 뒤집기')
def reverse(str):
    if str == '':
        return None
    else:
        reverse(str[1:])
        print(str[0])
print(reverse('abcde'))
print()

result = ''
for i in 'pieaaaa':
    result = i + result
print(result)
print()

x = 0
for i in '2231':
    x += int(i)
print(x)

def sum(n):
    if n == '':
        return 0
    else:
        return int(n[0]) + int(sum(n[1:]))
print(sum('2231'))

