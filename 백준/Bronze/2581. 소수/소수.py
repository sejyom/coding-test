from sys import stdin

n=int(stdin.readline())
m=int(stdin.readline())
arr=list()

if n==1:
    n=2
for i in range(n, m+1):
    z=2; flag=0
    while z*z<=i:
        if i%z==0:
            flag=1
            break
        z+=1
    if flag==0:
        arr.append(i)

if len(arr):
    print(sum(arr), arr[0], sep='\n')
else:
    print(-1)
