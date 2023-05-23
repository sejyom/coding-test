import sys

lst = list(map(int, sys.stdin.readline().split()))
res = 0

for i in lst:
    res += i**2

print(res%10)