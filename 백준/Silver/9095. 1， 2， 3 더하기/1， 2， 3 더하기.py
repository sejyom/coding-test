def num_of_cases(num):
    if num == 1:
        return 1
    elif num == 2:
        return 2
    elif num == 3:
        return 4

    return num_of_cases(num - 1) + num_of_cases(num - 2) + num_of_cases(num - 3)


n = int(input())
for i in range(n):
    print(num_of_cases(int(input())))