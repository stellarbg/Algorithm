def solution(a, b):
    days = 0
    days_list = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"]
    days_in_month = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    for i in range(1, a):
        days += days_in_month[i]

    days += b
    day = days % 7

    return days_list[day - 1]