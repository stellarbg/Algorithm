def dfs(numbers, target, index, current_sum):
    total = 0

    if index == len(numbers):
        if current_sum == target:
            return 1
        else:
            return 0

    total += dfs(numbers, target, index + 1, current_sum + numbers[index])
    total += dfs(numbers, target, index + 1, current_sum - numbers[index])

    return total


def solution(numbers, target):
    answer = dfs(numbers, target, 0, 0)
    return answer