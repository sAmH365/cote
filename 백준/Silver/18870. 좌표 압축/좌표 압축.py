N = int(input())
arr_inputs = list(map(int, input().split()))
arr_origin = arr_inputs.copy()

sorted_set = sorted(set(arr_inputs))

dict = {}
for index, n in enumerate(list(sorted_set)):
  if n not in dict:
    dict[n] = index

result = ' '.join(str(dict[n]) for n in arr_origin)

print(result)