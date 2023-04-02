sugar = int(input())
cnt=0
if sugar%5==0:
    print(sugar//5)
else:
    while True:
        sugar-=3
        cnt+=1
        if sugar%5==0:
            cnt+=sugar//5
            print(cnt)
            break
        if sugar<0:
            print(-1)
            break



