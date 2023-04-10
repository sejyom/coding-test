lst=input().split()
h=int(lst[0])
m=int(lst[1])

if not(h>=0 and h<=23) or not(m>=0 and m<=59):
    print('잘못된 입력입니다.')
    
if h==0:
    if m<45:
        h=23; m=60-(45-m);
    else: m=m-45;
        
else:
    if m>=45: m-=45
    else: h-=1; m=60-(45-m);

print('%d %d' % (h, m))
