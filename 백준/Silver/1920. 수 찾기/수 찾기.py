from sys import stdin

def BSearch(arr: list, num: int) -> int:
    first = 0
    last = len(arr)-1

    while(first<=last):
        mid = (first + last) // 2
        if num<arr[mid]:
            last=mid-1
        elif num>arr[mid]:
            first=mid+1
        elif num==arr[mid]:
            return 1
    return 0

n=int(stdin.readline())
a=sorted(list(map(int, stdin.readline().split())))
m=int(stdin.readline())
b=list(map(int, stdin.readline().split()))

for i in b:
    print(BSearch(a, i))