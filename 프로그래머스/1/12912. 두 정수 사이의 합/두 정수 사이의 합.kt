class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0

        if (a < b) {
            for (num in a..b) {
                answer += num
            }
        } else {
            for (num in b..a) {
                answer += num
            }
        }

        return answer
    }
}