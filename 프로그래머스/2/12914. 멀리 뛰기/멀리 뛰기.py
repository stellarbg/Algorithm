from collections import deque

def solution(n):

    ways = [0] * (n + 1)
    ways[0] = 1

    dx = [1, 2]

    queue = deque([0])

    while queue:
        current = queue.popleft()

        for i in range(2):
            nx = current + dx[i]

            if nx <= n:
                if ways[nx] == 0:
                    queue.append(nx)
                ways[nx] += ways[current]

    return ways[n] % 1234567