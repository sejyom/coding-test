def solution(n):
    n=list(str(n))
    n.sort(reverse=True)
    n=int(''.join(n))
    return n