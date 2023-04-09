import sys

n = int(sys.stdin.readline())
lst = []
dp = [0 for i in range(n+1)]

for i in range(n):
    t, p = map(int, sys.stdin.readline().split(" "))
    lst.append([t, p])

for i in range(n-1, -1, -1):
    if i + lst[i][0] <= n: # 상담 시작일 + 걸리는 시간이 퇴사일을 넘기지 않을 때
        dp[i] = max(dp[i+1], lst[i][1]+dp[i+lst[i][0]])
    else:
        dp[i] = dp[i+1]

print(dp[0])
