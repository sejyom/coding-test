def solution(s):
    countp=0; county=0
    for i in range(len(s)):
        if 'p'==s[i]:
            countp+=1
        elif 'P'==s[i]:
            countp+=1
        elif 'y'==s[i]:
            county+=1
        elif 'Y'==s[i]:
            county+=1
    return True if countp==county else False