n = int(input())
graph = list(map(int, input().split()))
s = int(input())

visited = [0] * n
cnt = 1

def dfs(x):
    global cnt

    for dx in (x - graph[x], x + graph[x]):
        if 0 <= dx < n and visited[dx] == 0:
            cnt += 1
            visited[dx] = 1
            dfs(dx)

dfs(s - 1)
print(cnt)