from collections import deque

def solution(n, wires):
    graph = [[] for _ in range(n + 1)]

    for v1, v2 in wires:
        graph[v1].append(v2)
        graph[v2].append(v1)

    def bfs(start):
        visited = [0] * (n + 1)
        queue = deque([start])
        visited[start] = 1
        cnt = 1

        while queue:
            current = queue.popleft()
            for i in graph[current]:
                if not visited[i]:
                    queue.append(i)
                    visited[i] = 1
                    cnt += 1
        return cnt

    answer = n
    for a, b in wires:
        graph[a].remove(b)
        graph[b].remove(a)
        
        answer = min(abs(bfs(a) - bfs(b)), answer)

        graph[a].append(b)
        graph[b].append(a)

    return answer