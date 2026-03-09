import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val s = HashSet<String>()
    var answer = 0

    repeat(n) {
        val word = readln()
        s.add(word)
    }

    repeat(m) {
        val input = readln()

        if (s.contains(input)) {
            answer += 1
        }
    }

    println(answer)
}