N, M = map(int, input().split())

nums = [i for i in range(1, N + 1)]


def backtrack(curr):
    if len(curr) == M:
        print(" ".join(map(str, curr)))
        return

    if curr:
        last = curr[-1]
    else:
        last = 0

    for num in nums:
        if num >= last:
            curr.append(num)
            backtrack(curr)
            curr.pop()


backtrack([])
