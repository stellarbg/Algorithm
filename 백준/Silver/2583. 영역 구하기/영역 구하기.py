import sys
sys.setrecursionlimit(10**6)

M, N, K = map(int, input().split())

graph = [[0] * N for _ in range(M)]
areas = []

for _ in range(K):
    x1, y1, x2, y2 = map(int, input().split())

    for y in range(y1, y2):
        for x in range(x1, x2):
            graph[y][x] = 1

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


def dfs(x, y):
    global cnt
    graph[x][y] = 1
    cnt += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < M and 0 <= ny < N and graph[nx][ny] == 0:
            graph[nx][ny] = 1
            dfs(nx, ny)

    return cnt


for y in range(M):
    for x in range(N):
        if graph[y][x] == 0:
            cnt = 0
            dfs(y, x)
            areas.append(cnt)

areas.sort()
print(len(areas))
print(" ".join(map(str, areas)))
