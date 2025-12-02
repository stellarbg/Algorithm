class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var number = num.toLong()

        while (number != 1L) {

            if (answer >= 500) return -1

            if (number % 2L == 0L) {
                number /= 2L
            } else {
                number = number * 3L + 1L
            }
            answer += 1
        }

        return answer
    }
}