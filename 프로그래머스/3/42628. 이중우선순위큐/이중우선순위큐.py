from collections import deque


def solution(operations):
    answer = []
    queue = deque()

    for operation in operations:
        op, num = operation.split()

        if op == "I":
            queue.append(int(num))
        elif op == "D":
            if queue:
                if num == "1":
                    max_num = max(queue)
                    queue.remove(max_num)
                elif num == "-1":
                    min_num = min(queue)
                    queue.remove(min_num)

    if queue:
        answer.append(max(queue))
        answer.append(min(queue))
    else:
        answer = [0, 0]

    return answer