def solution(n, left, right):
    answer = []
    for k in range(left, right + 1):
        i = k // n  # 행 번호
        j = k % n   # 열 번호
        answer.append(max(i, j) + 1)
    return answer