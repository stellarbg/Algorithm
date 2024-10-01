def solution(k, tangerine):
    answer = 0

    dic = {}

    for t in tangerine:
        if t not in dic:
            dic[t] = 0
        dic[t] += 1

    counts = sorted(dic.values(), reverse=True)

    total_selected = 0

    for count in counts:
        total_selected += count
        answer += 1

        if total_selected >= k:
            break

    return answer