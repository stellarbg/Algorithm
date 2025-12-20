class Solution {
    fun solution(s: String): Boolean {

        if (s.length == 4 || s.length == 6) {
            for (word in s) {
                if (!word.isDigit()) return false
            }
            return true
        }

        return false
    }
}