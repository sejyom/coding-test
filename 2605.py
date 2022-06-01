#2605_python
num = int(input()) # 학생 수
lst=list(map(int, input().split())) # 학생들이 뽑은 번호
sort=[] # 줄을 선 순서가 들어갈 리스트 변수
for i in range(num):
    sort.insert(i-lst[i], i+1)

for i in range(len(sort)):
    print(sort[i], end=' ')