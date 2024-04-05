from sys import stdin

n = int(stdin.readline())
arr = list(map(int, stdin.readline().split()))
count=0

for i in arr:
    a=2
    flag=0
    if i==1:
        continue
    while(a*a<=i): # 2부터 루트i까지 반복
        if i%a==0:
            flag=1
            break
        a+=1
    if flag==0:
        count+=1
print(count)
