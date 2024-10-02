def solution(k, score):
    answer = []

    # 명예의 전당
    honor = []

    for s in score:
        if len(honor) < k:
            honor.append(s)
        else:
            if s > min(honor):
                honor.remove(min(honor))
                honor.append(s)

        honor.sort()
        answer.append(honor[0])

    return answer
