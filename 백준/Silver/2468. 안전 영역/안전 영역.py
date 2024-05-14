import sys
sys.setrecursionlimit(100000)

N = int(input())

graph = []
max_num = 0
result = 1

for _ in range(N):
    num = list(map(int, input().split()))
    graph.append(num)

    for i in num:
        if i > max_num:
            max_num = i

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


def dfs(x, y, standard):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < N and 0 <= ny < N and visited[nx][ny] == 0:
            if graph[nx][ny] > standard:
                visited[nx][ny] = 1
                dfs(nx, ny, standard)


for i in range(max_num):
    visited = [[0] * N for _ in range(N)]
    cnt = 0

    for j in range(N):
        for k in range(N):
            if graph[j][k] > i and visited[j][k] == 0:
                cnt += 1
                visited[j][k] = 1
                dfs(j, k, i)
    result = max(result, cnt)

print(result)

