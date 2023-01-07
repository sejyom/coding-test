import sys

arr = [1, 1, 2, 2, 2, 8]
ins = list(map(int, sys.stdin.readline().split()))

for i in range(len(arr)):
    if (arr[i] != ins[i]):
        res = arr[i] - ins[i]
    else:
        res = 0
    print(res, end=" ")
