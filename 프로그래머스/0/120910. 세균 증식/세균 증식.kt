class Solution {
    fun solution(n: Int, t: Int): Int {
        return n * (Math.pow(2.0, t.toDouble())).toInt()
    }
}