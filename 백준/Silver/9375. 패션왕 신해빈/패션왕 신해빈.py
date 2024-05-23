T = int(input())

for _ in range(T):
    n = int(input())

    clothes = {}
    cnt = 1

    for _ in range(n):
        name, type = input().split()

        if type not in clothes:
            clothes[type] = []

        clothes[type].append(name)

    for i in clothes:
        cnt *= (len(clothes[i]) + 1)

    print(cnt - 1)
