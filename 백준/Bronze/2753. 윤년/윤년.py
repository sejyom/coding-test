year = int(input())

if year<0 or year>4000:
    print('잘못된 입력입니다.')

if(year%4==0 and not year%100==0) or (year%4==0 and year%400==0):
    print('1')
else: print('0')
