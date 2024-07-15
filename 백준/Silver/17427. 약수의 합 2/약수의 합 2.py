def measure(N):
    arr = [0] * (N + 1)

    for i in range(1, N + 1):
        for j in range(i, N + 1, i):
            arr[j] += i

    g = 0
    for i in range(1, N + 1):
        g += arr[i]

    return g


N = int(input())
print(measure(N))