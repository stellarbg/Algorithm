def solution(s, n):
    answer = ''

    for word in s:
        if word == " ":
            answer += word
        else:
            if word.isupper():
                new_word = chr((ord(word) - ord("A") + n) % 26 + ord("A"))
            else:
                new_word = chr((ord(word) - ord("a") + n) % 26 + ord("a"))

            answer += new_word

    return answer