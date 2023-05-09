import sys
def bracket(str):
    stack=[]
    for i in str:
        if i=='(' or i=='[':
            stack.append(i)
        elif i==')':
            if len(stack)!=0 and stack[-1]=='(':
                stack.pop()
            else:
                stack.append(i)
                break
        elif i==']':
            if len(stack)!=0 and stack[-1]=='[':
                stack.pop()
            else:
                stack.append(i)
                break
    if len(stack)==0:
        return "yes"
    else: return "no"

input = sys.stdin.readline
while True:
    str = input().rstrip()
    if str == ".":
        break
    print(bracket(str))
