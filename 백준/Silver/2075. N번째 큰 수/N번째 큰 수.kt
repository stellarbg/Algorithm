import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()

    val arr = mutableListOf<Int>()

    repeat(n) {
        val st = StringTokenizer(readln())

        while (st.hasMoreTokens()) {
            val num = st.nextToken()
            arr.add(num.toInt())
        }
    }

    arr.sortDescending()
    println(arr[n - 1])
}