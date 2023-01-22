def solution(arr):
    arr2=list(map(int ,str(arr[0])))
    for i in range(1, len(arr)):
        if arr[i-1]==arr[i]:
            pass
        else:
            arr2.append(arr[i])
    return arr2