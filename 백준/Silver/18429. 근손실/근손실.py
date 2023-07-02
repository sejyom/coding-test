import sys
import itertools

n, k = map(int, sys.stdin.readline().split(" "))
kit = list(map(int, sys.stdin.readline().split(" ")))
lst = list(itertools.permutations(kit, n))

cnt = 0
for i in lst:
    w = 500
    flag = 1
    for j in i:
        w += (-k + j)
        if w < 500:
            flag = 0
            break
    if flag == 1:
        cnt += 1
print(cnt)


