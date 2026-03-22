import java.util.StringTokenizer

fun main() {
    val k = readln().toInt()

    val st = StringTokenizer(readln())
    val arr = IntArray((1 shl k) - 1)

    for (i in arr.indices) {
        arr[i] = st.nextToken().toInt()
    }

    val result = Array(k) { mutableListOf<Int>() }

    fun building(start: Int, end: Int, depth: Int) {
        if (start > end) return

        val mid = (start + end) / 2

        result[depth].add(arr[mid])

        building(start, mid - 1, depth + 1)
        building(mid + 1, end, depth + 1)
    }

    building(0, arr.size - 1, 0)

    val sb = StringBuilder()
    for (i in 0 until k) {
        for (num in result[i]) {
            sb.append(num).append(" ")
        }
        sb.append("\n")
    }

    print(sb)
}