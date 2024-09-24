def solution(answers):
    patterns = [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]

    scores = [0, 0, 0]

    for i in range(len(answers)):
        for j in range(3):
            if answers[i] == patterns[j][i % len(patterns[j])]:
                scores[j] += 1

    max_score = max(scores)
    print(scores)

    answer = [index + 1 for index, score in enumerate(scores) if max_score == score]

    return answer