s=int(input())
count=0
sum=0
for i in range(1, s+1):
    sum+=i
    count+=1
    if sum==s:
        break
    if sum+(i+1)>s:
        sum-=i
        count-=1
print(count)