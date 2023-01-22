def solution(n):
    lst = []
    for i in range(1, n):
        if n%i==1:
            lst.append(i)
    lst=sorted(lst)
    return lst[0]

print(solution(12))