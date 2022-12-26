import sys

num = int(sys.stdin.readline())
lst=[]

for i in range(num):
    a, b= map(int, sys.stdin.readline().split())
    lst.append(a+b)

for i in range(len(lst)):
    print(lst[i])