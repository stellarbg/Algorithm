import java.util.StringTokenizer

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val st = StringTokenizer(readln())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        sb.append(lcm(a,b)).append("\n")
    }

    println(sb)
}

fun lcm(a: Int, b: Int): Int {
    return (a * b) / gcd(a, b)
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}