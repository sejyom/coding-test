def solution(s):
    if len(s)%2==0:
        return ''.join(s[(len(s)//2)-1:(len(s)//2)+1])
    elif len(s)%2==1:
        return ''.join(s[len(s)//2])

print(solution("qwer"))