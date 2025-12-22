class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val gcdValue = gcd(n, m)
        
        val lcmValue = (n.toLong() * m / gcdValue).toInt()

        return intArrayOf(gcdValue, lcmValue)
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}