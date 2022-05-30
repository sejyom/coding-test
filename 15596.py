#15596_python
''' 1) sum() 사용
def solve(a):
    print(sum(a))


n = list(map(int , input().split()))
solve(n)
'''

#2) for문 사용
def solve(a):
    ans = 0
    for i in range(len(a)):
        ans += a[i]
    return ans


n = list(map(int, input().split()))
ans = solve(n)
print(ans)
