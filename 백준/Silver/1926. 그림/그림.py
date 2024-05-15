import sys
sys.setrecursionlimit(10**6)

n, m = map(int, input().split())

graph = []
visited = [[0] * m for _ in range(n)]

for _ in range(n):
    picture = list(map(int, input().split()))
    graph.append(picture)

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


def dfs(x, y):
    global cnt
    visited[x][y] = 1
    cnt += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1 and visited[nx][ny] == 0:
            dfs(nx, ny)


picture_count = 0
max_area = 0

for i in range(n):
    for j in range(m):
        if graph[i][j] == 1 and visited[i][j] == 0:
            cnt = 0
            dfs(i, j)
            picture_count += 1
            max_area = max(max_area, cnt)

print(picture_count)
print(max_area)
