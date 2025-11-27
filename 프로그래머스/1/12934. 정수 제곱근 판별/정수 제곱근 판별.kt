import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {

        val xDouble = sqrt(n.toDouble())

        val xLong = xDouble.toLong()

        if (xLong * xLong == n) {
            val result = xLong + 1
            return result * result
        } else {
            return -1
        }
    }
}