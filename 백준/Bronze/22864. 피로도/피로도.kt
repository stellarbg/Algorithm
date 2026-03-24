import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()
    val d = st.nextToken().toInt()

    var gauge = 0
    var answer = 0

    for (time in 1..24) {
        if (gauge + a <= d) {
            gauge += a
            answer += b
        } else {
            gauge -= c
            if (gauge < 0) gauge = 0
        }
    }
    println(answer)
}