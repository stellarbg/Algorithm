def measure(MAX_N):
    arr = [0] * (MAX_N + 1)
    g = [0] * (MAX_N + 1)

    for i in range(1, MAX_N + 1):
        for j in range(i, MAX_N + 1, i):
            arr[j] += i

    for i in range(1, MAX_N + 1):
        g[i] = g[i - 1] + arr[i]

    return g


MAX_N = 1000000
g_values = measure(MAX_N)

results = []

T = int(input())

for _ in range(T):
    N = int(input())
    results.append(g_values[N])

for i in results:
    print(i)