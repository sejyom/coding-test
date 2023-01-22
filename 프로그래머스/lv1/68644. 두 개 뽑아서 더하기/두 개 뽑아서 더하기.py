def solution(numbers):
    answer = set()
    for i in range(len(numbers)):
        for j in range(len(numbers)):
            if(i==j):
                pass
            else:
                answer.add(numbers[i]+numbers[j])
    answer = list(answer)
    answer.sort()
    return answer

numbers = [2, 1, 3, 4, 1]
print(solution(numbers))