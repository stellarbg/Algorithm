class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {

        val rowSize = arr1.size
        val colSize = arr1[0].size
        val answer = Array(rowSize) { IntArray(colSize) }

        for (i in 0 until rowSize) {
            for (j in 0 until colSize) {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }

        return answer
    }
}