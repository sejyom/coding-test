num=int(input())
lst=list()
for i in range(num):
    num=int(input())
    if num==0:
        lst.pop()
    else:
        lst.append(num)
print(sum(lst))