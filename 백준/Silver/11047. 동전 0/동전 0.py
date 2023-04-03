from sys import stdin
def findKey(n, k, lst):
    for i in range(1, n):
        if k>=lst[0]:
            return i-1
        if k < lst[i - 1] and k >= lst[i]:
            return i

    return n - 1


lst = []
cnt = 0

n, k = map(int, stdin.readline().split())

for _ in range(n):
    lst.append(int(input()))

lst.reverse()

while k != 0:
    f = findKey(n, k, lst)
    cnt += k // lst[f]
    k %= lst[f]

print(cnt)