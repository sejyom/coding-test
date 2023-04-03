import sys
lst = []

def push(x):
    lst.append(x)

def pop():
    if len(lst)==0:
        print('-1')
    else:
        print(lst.pop(0))

def size():
    print(len(lst))

def empty():
    if len(lst)==0:
        print('1')
    else:
        print('0')

def front():
    if len(lst):
        print(lst[0])
    else:
        print('-1')

def back():
    if len(lst):
        print(lst[-1])
    else:
        print('-1')


for _ in range(int(sys.stdin.readline())):
    msg = list(sys.stdin.readline().split())
    if msg[0]=='push':
        push(int(msg[1]))
    elif msg[0]=='pop':
        pop()
    elif msg[0]=='size':
        size()
    elif msg[0]=='empty':
        empty()
    elif msg[0]=='front':
        front()
    elif msg[0]=='back':
        back()
    else:
        pass