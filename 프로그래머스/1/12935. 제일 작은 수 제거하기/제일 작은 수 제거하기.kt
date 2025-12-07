class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.toMutableList()

        answer.remove(answer.minOrNull())

        if (answer.isEmpty()) {
            return intArrayOf(-1)
        } else {
            return answer.toIntArray()
        }

    }
}