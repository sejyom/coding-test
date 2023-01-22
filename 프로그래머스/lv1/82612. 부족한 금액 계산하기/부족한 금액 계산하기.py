def solution(price, money, count):
    answer = 0
    for i in range(1, count+1):
        answer+=(price*i)

    answer -= money
    if answer > 0:
        return answer
    else:
        return 0
    return answer


print(solution(3, 20, 4))