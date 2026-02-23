N = int(input())
arr_inputs = list(map(int, input().split()))
arr_copy = arr_inputs.copy()

arr_inputs.sort()
# print(arr_inputs)

my_set = set(arr_inputs)
sorted_set = sorted(my_set)

dict = {}
for index, n in enumerate(list(sorted_set)):
  if n not in dict:
    dict[n] = index

result = ' '.join(str(dict[n]) for n in arr_copy)

print(result)