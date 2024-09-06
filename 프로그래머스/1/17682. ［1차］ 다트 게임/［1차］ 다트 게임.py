def solution(dartResult):
    chance = 0
    num_list = []
    i = 0

    while i < len(dartResult):
        result = dartResult[i]

        if result.isdigit():
            if dartResult[i + 1].isdigit():
                num = int(result + dartResult[i + 1])
                i += 1
            else:
                num = int(result)
            chance += 1
            num_list.append(num)

        elif result == "S":
            num_list[chance - 1] = num_list[chance - 1] ** 1
        elif result == "D":
            num_list[chance - 1] = num_list[chance - 1] ** 2
        elif result == "T":
            num_list[chance - 1] = num_list[chance - 1] ** 3
        elif result == "*":
            if chance > 1:
                num_list[chance - 2] *= 2
            num_list[chance - 1] *= 2
        elif result == "#":
            num_list[chance - 1] *= -1

        i += 1

    return sum(num_list)