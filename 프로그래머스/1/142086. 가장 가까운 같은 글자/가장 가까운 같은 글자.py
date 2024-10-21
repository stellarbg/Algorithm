def solution(s):
    answer = []

    dic = {}

    for index, word in enumerate(s):

        if word in dic:
            answer.append(index - dic[word])
        else:
            answer.append(-1)

        dic[word] = index

    return answer