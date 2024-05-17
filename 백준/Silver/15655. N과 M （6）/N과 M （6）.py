N, M = map(int, input().split())

nums = list(map(int, input().split()))
nums.sort()


def backtracking(start, curr):
    if len(curr) == M:
        print(" ".join(map(str, curr)))

    for i in range(start, len(nums)):
        curr.append(nums[i])
        backtracking(i + 1, curr)
        curr.pop()


backtracking(0, [])
