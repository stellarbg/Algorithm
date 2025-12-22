import java.util.*

fun main() {
    val n = readln().toInt()
    val st1 = StringTokenizer(readln())

    val cardCountMap = mutableMapOf<Int, Int>()

    for (i in 0 until n) {
        val num = st1.nextToken().toInt()
        cardCountMap[num] = cardCountMap.getOrDefault(num, 0) + 1
    }

    val m = readln().toInt()
    val st2 = StringTokenizer(readln())

    val result = StringBuilder()

    for (i in 0 until m) {
        val query = st2.nextToken().toInt()
        result.append(cardCountMap.getOrDefault(query, 0)).append(" ")
    }

    println(result.toString().trim())
}