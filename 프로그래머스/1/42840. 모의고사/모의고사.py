def solution(answers):
    answer = []

    patten = [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]

    scores = [0, 0, 0]

    for i in range(len(answers)):
        for j in range(len(patten)):
            if answers[i] == patten[j][i % len(patten[j])]:
                scores[j] += 1

    max_score = max(scores)

    for index, score in enumerate(scores):
        if score == max_score:
            answer.append(index + 1)

    return answer