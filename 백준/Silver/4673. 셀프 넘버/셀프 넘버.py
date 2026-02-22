num = 10000

def d_n(n):
  sum_res = 0

  for s in str(n):
    sum_res += int(s)
  result = n + sum_res

  return result


list = []
result = []
for i in range(1, num + 1):
  list.append(d_n(i))

list.sort()

for i in range(1, num + 1):
  if i not in list:
    result.append(i)

print(*result, sep='\n')