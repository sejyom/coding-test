def solution(n, m):
    a=[]
    a.append(gcd(n, m)) #gcd
    a.append(int(n*m/gcd(n, m))) #lcm
    return a

def gcd(n, m):
    while n!=0:
        z=m%n
        m=n
        n=z
    return m