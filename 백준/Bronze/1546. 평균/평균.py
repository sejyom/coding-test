import sys

n = sys.stdin.readline()
lst = list(map(int, sys.stdin.readline().split()))
m = 0; res = 0

for i in lst:
    m = max(i, m)

for i in lst:
    res += i / m * 100

print(res / len(lst))
