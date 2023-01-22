def solution(arr1, arr2):
    answer=[]
    for i in range(len(arr1)):
        array=[]
        for j in range(len(arr1[0])):
            array.append(arr1[i][j]+arr2[i][j])
        answer.append(array)
    return answer