class Solution {
    fun solution(s: String): String {
        if (s.length % 2 == 0) {
            val start = s.length / 2 - 1
            val end = s.length / 2
            return "${s[start]}${s[end]}"
        } else {
            return s[s.length / 2].toString()
        }
    }
}