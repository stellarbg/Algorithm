
def solution(n):

    standard = bin(n)
    standard_cnt = standard.count("1")

    while True:
        next = n + 1
        next_bin = bin(next)

        if next_bin.count("1") == standard_cnt:
            break
        else:
            n += 1

    return next