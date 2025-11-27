class Solution {
    fun solution(x: Int): Boolean {
        val arr = x.toString().toList()
        var total = 0

        for (num in arr) {
            total += num.digitToInt()
        }

        return x % total == 0
    }
}