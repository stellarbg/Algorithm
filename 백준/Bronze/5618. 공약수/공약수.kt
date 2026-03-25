import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()
    val st = StringTokenizer(readln())

    var commonGcd = st.nextToken().toInt()

    while (st.hasMoreTokens()) {
        commonGcd = gcd(commonGcd, st.nextToken().toInt())
    }

    for (i in 1..commonGcd) {
        if (commonGcd % i == 0) {
            println(i)
        }
    }
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}