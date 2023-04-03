import sys
def push(x):
    lst.append(x)

def pop():
    if len(lst)==0:
        print('-1')
    else:
        print(lst.pop())

def size():
    print(len(lst))

def empty():
    if len(lst)==0:
        print('1')
    else:
        print('0')

def top():
    if len(lst)==0:
        print('-1')
    else:
        print(lst[-1])


lst = []
loop = int(sys.stdin.readline())
# input() 함수는 시간초과 에러 뜸..
# 입출력 속도 비교: sys.stdin.readline() > raw_input() > input()
for i in range(loop):
    lst2 = list(sys.stdin.readline().split())
    if lst2[0] == 'push':
        lst2[1] = int(lst2[1])
        push(lst2[1])
    elif lst2[0] == 'pop':
        pop()
    elif lst2[0] == 'top':
        top()
    elif lst2[0] == 'size':
        size()
    elif lst2[0] == 'empty':
        empty()
    else:
        print('잘못된 입력입니다')

