import sys

inputs = sys.stdin.readline

vowel = ('a', 'e', 'i', 'o', 'u')
st = input()
while st != '#':
  print(sum([1 for char in st.lower() if char in vowel]))
  st = input()