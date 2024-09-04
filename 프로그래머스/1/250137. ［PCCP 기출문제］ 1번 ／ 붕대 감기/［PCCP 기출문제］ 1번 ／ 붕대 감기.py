def solution(bandage, health, attacks):
    t, x, y = bandage
    attack = 0
    continuity = 0
    hp = health
    whole_time = attacks[-1][0]

    for i in range(whole_time):
        cur_time = i + 1

        if cur_time == attacks[attack][0]:
            health -= attacks[attack][1]
            continuity = 0
            attack += 1
            
        else:
            continuity += 1

            if continuity == t:
                health += y
                continuity = 0
            health += x

            if health > hp:
                health = hp

        if health <= 0:
            return -1

    return health