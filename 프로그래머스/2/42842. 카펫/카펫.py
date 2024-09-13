def solution(brown, yellow):
    total = brown + yellow

    for height in range(1, total + 1):
        if total % height == 0:
            width = total // height
            
            if 2 * (width + height) - 4 == brown:
                return [width, height]