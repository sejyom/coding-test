def solution(arr, divisor):
    a=[]
    for i in arr:
        if i%divisor==0:
            a.append(i)
    if len(a)==0:
        return [-1]
    set(a); a.sort()
    return list(a)