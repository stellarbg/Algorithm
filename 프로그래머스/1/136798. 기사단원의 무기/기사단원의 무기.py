def solution(number, limit, power):
    
    knights = [i + 1 for i in range(number)]

    cnt_list = []

    for knight in knights:
        cnt = 0
        for i in range(1, int(knight ** 0.5) + 1):
            if knight % i == 0:
                cnt += 1
                if i != knight // i:
                    cnt += 1

        if cnt > limit:
            cnt_list.append(power)
        else:
            cnt_list.append(cnt)

    return sum(cnt_list)