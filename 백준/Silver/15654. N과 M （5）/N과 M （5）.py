N, M = map(int, input().split())

nums = list(map(int, input().split()))
nums.sort()


def backTracking(curr):
    if len(curr) == M:
        print(" ".join(map(str, curr)))
        return

    for num in nums:
        if num not in curr:
            curr.append(num)
            backTracking(curr)
            curr.pop()


backTracking([])
