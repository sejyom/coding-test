import sys


def fourSquares(n):
    dp = [0] * (n+1)
    m = 1
    while m*m <= n:
        dp[m*m] = 1
        m += 1

    for i in range(1, n + 1):
        if dp[i] != 0:
            continue
        m = 1
        while m*m <= i:
            if dp[i] == 0:
                dp[i] = dp[m*m] + dp[i - (m*m)]
            else:
                dp[i] = min(dp[i], dp[m*m] + dp[i - (m*m)])
            m += 1
    return dp[n]


print(fourSquares(int(sys.stdin.readline())))
