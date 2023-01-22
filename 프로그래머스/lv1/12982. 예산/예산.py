def solution(d, budget):
    d.sort()
    print(d)
    count=0; sum=d[0]
    if sum<=budget:
        count+=1
        for i in range(1, len(d)):
            sum+=d[i]
            if sum<=budget:
                count+=1
    return count