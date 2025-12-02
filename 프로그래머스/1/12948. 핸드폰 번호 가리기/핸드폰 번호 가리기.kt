class Solution {
    fun solution(phone_number: String): String {

        val endIndex = phone_number.length - 4
        val maskedPart = "*".repeat(endIndex)

        return phone_number.replaceRange(0, endIndex, maskedPart)
    }
}