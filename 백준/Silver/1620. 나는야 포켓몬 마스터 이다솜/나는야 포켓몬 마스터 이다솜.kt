import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val nameByNum = arrayOfNulls<String>(n + 1)
    val numByName = mutableMapOf<String, Int>()

    val answer = StringBuilder()

    for (i in 1..n) {
        val name = readln()
        nameByNum[i] = name
        numByName[name] = i
    }

    repeat(m) {
        val problem = readln()
        if (problem[0].isDigit()) {
            answer.append(nameByNum[problem.toInt()]).append("\n")
        } else {
            answer.append(numByName[problem]).append("\n")
        }
    }

    println(answer)
}