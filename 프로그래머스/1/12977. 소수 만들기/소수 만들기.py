def solution(nums):
    answer = 0

    for i in range(len(nums) - 2):
        for j in range(i + 1, len(nums) - 1):
            for k in range(j + 1, len(nums)):
                total = nums[i] + nums[j] + nums[k]
                measure = 0

                for num in range(1, total + 1):
                    if total % num == 0:
                        measure += 1

                if measure == 2:
                    answer += 1

    return answer