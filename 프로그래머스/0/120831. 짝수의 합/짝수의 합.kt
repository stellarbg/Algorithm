class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        for (num in 1..n) {
            if (num % 2 == 0) {
                answer += num
            }
        }

        return answer
    }
}