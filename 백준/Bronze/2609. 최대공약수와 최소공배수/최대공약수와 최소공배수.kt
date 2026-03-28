import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())
    val sb = StringBuilder()

    val first = st.nextToken().toInt()
    val second = st.nextToken().toInt()

    sb.append(gcd(first, second)).append("\n")
    sb.append(lcm(first, second))

    println(sb)
}

fun lcm(a: Int, b: Int): Int {
    return (a * b) / gcd(a, b)
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
