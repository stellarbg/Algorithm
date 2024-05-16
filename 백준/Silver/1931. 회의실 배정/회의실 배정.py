N = int(input())

arr = []
endPoint = 0
cnt = 0

for _ in range(N):
    start, end = list(map(int, input().split()))
    arr.append([start, end])

arr.sort(key=lambda x: (x[1], x[0]))

for newStart, newEnd in arr:
    if endPoint <= newStart:
        cnt += 1
        endPoint = newEnd

print(cnt)



