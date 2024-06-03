def solution(numbers):
    answer = []

    for i in range(len(numbers) - 1):
        for j in range(i + 1, len(numbers)):
            total = numbers[i] + numbers[j]
            if total not in answer:
                answer.append(total)

    return sorted(answer)