def solution(k, m, score):
    answer = 0

    score.sort(reverse=True)

    cnt = len(score) // m

    box = [[] for _ in range(cnt + 1)]
    index = 0

    for i in score:
        if len(box[index]) == m and index < cnt:
            index += 1
        box[index].append(i)
    for i in range(len(box)):
        if len(box[i]) == m:
            answer += min(box[i]) * m

    return answer