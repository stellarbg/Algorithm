from collections import deque

N = int(input())

graph = []
max_num = 0
result = []

for _ in range(N):
    row = list(map(int, input().split()))
    graph.append(row)

    for i in row:
        if i > max_num:
            max_num = i

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


def bfs(x, y, standard):
    queue = deque()
    queue.append((x, y))
    visited[x][y] = 1

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < N and 0 <= ny < N and visited[nx][ny] == 0:
                if graph[nx][ny] > standard:
                    queue.append((nx, ny))
                    visited[nx][ny] = 1


for i in range(max_num):
    visited = [[0] * N for _ in range(N)]
    cnt = 0
    for j in range(N):
        for k in range(N):
            if graph[j][k] > i and visited[j][k] == 0:
                bfs(j, k, i)
                cnt += 1

    result.append(cnt)

print(max(result))
