def solution(strings, n):
    answer = []

    for i in strings:
        answer.append(i[n] + i)
    answer.sort()

    return [i[1:] for i in answer]