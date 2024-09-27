def solution(nums):
    n = len(nums) // 2  
    unique_pokemon = len(set(nums))  
    
    return min(n, unique_pokemon)