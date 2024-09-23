def solution(genres, plays):
    answer = []
    playDic = {}  
    dic = {}      
    
    for i in range(len(genres)):
        playDic[genres[i]] = playDic.get(genres[i], 0) + plays[i]
        dic[genres[i]] = dic.get(genres[i], []) + [(plays[i], i)]
    
    genreSort = sorted(playDic.items(), key = lambda x: x[1], reverse = True)
    

    for (genre, totalPlay) in genreSort:
        dic[genre] = sorted(dic[genre], key = lambda x: (-x[0], x[1]))
        answer += [idx for (play, idx) in dic[genre][:2]]
    
    return answer