lst=input().split()
a=int(lst[0])
b=int(lst[1])

if a>b:
    print('>')
elif a<b:
    print('<')
else:
    print('==')
