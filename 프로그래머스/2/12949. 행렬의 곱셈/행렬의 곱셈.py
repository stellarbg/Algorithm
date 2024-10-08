def solution(arr1, arr2):

    row = len(arr1)
    column = len(arr2[0])
    m = len(arr1[0])  

    answer = [[0] * column for _ in range(row)]

    for i in range(row):
        for j in range(column):
            for k in range(m):
                answer[i][j] += arr1[i][k] * arr2[k][j]

    return answer