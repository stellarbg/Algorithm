N, M = map(int, input().split())

nums = [i for i in range(1, N + 1)]

ans = []


def bactrack(curr):
    if len(curr) == M:
        ans.append(curr[:])
        return

    for num in nums:
        curr.append(num)
        bactrack(curr)
        curr.pop()


bactrack([])

for i in ans:
    print(" ".join(map(str, i)))
