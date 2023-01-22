def solution(arr):
    min=0
    if len(arr)==1:
        return [-1]
    for i in range(1, len(arr)):
        if arr[min]>arr[i]:
            min=i
    min=arr[min]
    arr.remove(min)
    return arr