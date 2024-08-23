from collections import deque

def solution(maps):
    answer = []
    graph = [list(i) for i in maps]
    visited = [[False] * len(graph[0]) for _ in range(len(graph))]

    dx = [-1, 0, 1, 0] 
    dy = [0, 1, 0, -1]

    def bfs(x, y):
        queue = deque([(x, y)])
        visited[x][y] = True
        total_food = int(graph[x][y])  
        while queue:
            cx, cy = queue.popleft()
            for i in range(4):
                nx, ny = cx + dx[i], cy + dy[i]
                if 0 <= nx < len(graph) and 0 <= ny < len(graph[0]) and not visited[nx][ny]:
                    if graph[nx][ny] != 'X': 
                        visited[nx][ny] = True
                        total_food += int(graph[nx][ny])
                        queue.append((nx, ny))
        return total_food

    for i in range(len(graph)):
        for j in range(len(graph[0])):
            if graph[i][j] != 'X' and not visited[i][j]:  
                food = bfs(i, j)
                answer.append(food)

    if not answer:  
        return [-1]

    return sorted(answer)  