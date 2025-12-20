class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0

        for (i in 1..count) {
            answer += price * i
        }

        if (money > answer) {
            return 0
        }

        return answer - money
    }
}