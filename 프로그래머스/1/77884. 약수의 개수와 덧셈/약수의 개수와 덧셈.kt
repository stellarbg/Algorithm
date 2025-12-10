import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0

        for (num in left..right) {
            var sqrtN = sqrt(num.toDouble())

            if (sqrtN == sqrtN.toInt().toDouble()) {
                answer -= num
            } else {
                answer += num
            }
        }

        return answer
    }
}