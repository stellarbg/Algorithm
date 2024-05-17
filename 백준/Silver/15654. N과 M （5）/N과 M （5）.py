N, M = map(int, input().split())

nums = list(map(int, input().split()))
nums.sort()

ans = []


def backTracking(curr):
    if len(curr) == M:
        print(" ".join(map(str, curr[:])))
        return

    for num in nums:
        if num not in ans:
            ans.append(num)
            backTracking(ans)
            ans.pop()


backTracking([])
