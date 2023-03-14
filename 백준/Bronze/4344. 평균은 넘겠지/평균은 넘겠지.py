def avg(lst):
    cnt = 0;
    for i in range(len(lst)-1):
        if (sum(lst) - lst[0]) / lst[0] < lst[i+1]:
            cnt += 1;
    return cnt / lst[0] * 100


num = int(input())
res = []

for i in range(num):
    lst = list(map(int, input().split()))
    res.append(avg(lst))

for i in range(num):
    print("{:.3f}%".format(res[i]))
