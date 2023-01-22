def solution(array, commands):
    b=[]
    for i in range(len(commands)):
        a = array[(commands[i][0])-1:commands[i][1]]
        a.sort()
        b.append(a[commands[i][2]-1])
    return b