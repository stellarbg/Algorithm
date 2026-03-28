import java.util.StringTokenizer

fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()

    repeat(n) {
        val st = StringTokenizer(readln())
        val a = st.nextToken().toLong()
        val b = st.nextToken().toLong()

        sb.append(lcm(a, b)).append("\n")
    }

    println(sb)
}

fun lcm(a: Long, b: Long): Long {
    return (a * b) / gcd(a, b)
}

fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a else gcd(b, a % b)
}
