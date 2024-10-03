class Solution {
    fun solution(n: Long): IntArray {
        var answer = mutableListOf<Int>()

        for (i in n.toString().reversed()) {
            answer.add(i.toString().toInt())
        }

        return answer.toIntArray()
    }
}