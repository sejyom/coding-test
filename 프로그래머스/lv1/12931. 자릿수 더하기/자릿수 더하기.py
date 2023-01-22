def solution(n):
    answer=0
    a=list(str(n))
    for i in range(len(a)):
        answer+=int(''.join(a[i:i+1]))
    return answer