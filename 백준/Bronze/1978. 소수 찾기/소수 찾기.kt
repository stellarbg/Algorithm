import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()
    val st = StringTokenizer(readln())
    var answer = 0

    while (st.hasMoreTokens()) {
        val num = st.nextToken().toInt()
        var isPrime = false

        if (num < 2) {
            continue
        }

        for (i in 2 until num) {
            if (num % i == 0) {
                isPrime = true
            }
        }

        if (!isPrime) {
            answer += 1
        }
    }

    println(answer)
}