from collections import deque

n = int(input())
arr = list(map(int, input().split()))
s = int(input()) - 1

visited = [0] * n
visited[s] = 1

cnt = 1
queue = deque()
queue.append(s)

while queue:
    current = queue.popleft()
    jump_distance = arr[current]

    left = current - jump_distance
    if left >= 0 and visited[left] == 0:
        visited[left] = 1
        queue.append(left)
        cnt += 1

    right = current + jump_distance
    if right < n and visited[right] == 0:
        visited[right] = 1
        queue.append(right)
        cnt += 1

print(cnt)
