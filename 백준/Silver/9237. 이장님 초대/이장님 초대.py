n=int(input())
# lst=[int(input()) for _ in range(n)]
lst=list(map(int, input().split()))
lst.sort(reverse=True)
lst2=[]
j=2
for i in range(n):
    lst2.append(j+lst[i])
    j+=1

print(max(lst2))
