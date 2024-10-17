from collections import deque


def solution(k, dungeons):
    max_count = 0
    n = len(dungeons)

    # BFS를 위한 큐
    queue = deque([(k, 0, [False] * n)])  # (현재 피로도, 탐험한 던전 수, 방문 여부)

    while queue:
        current_fatigue, count, visited = queue.popleft()
        max_count = max(max_count, count)

        for i in range(n):
            if not visited[i]:  # 아직 탐험하지 않은 던전
                min_fatigue, fatigue_cost = dungeons[i]
                if current_fatigue >= min_fatigue:  # 던전을 탐험할 수 있는지 확인
                    # 던전 탐험 후 남은 피로도를 계산
                    next_fatigue = current_fatigue - fatigue_cost
                    next_visited = visited[:]
                    next_visited[i] = True  # 던전 방문 표시
                    # 다음 상태를 큐에 추가
                    queue.append((next_fatigue, count + 1, next_visited))

    return max_count