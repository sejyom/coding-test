h, m, s = map(int, input().split())
time = int(input())

h = (h+((m+((s+time)//60))//60))%24
m = (m+((s+time)//60))%60
s = (s+time)%60

print(h, m, s)