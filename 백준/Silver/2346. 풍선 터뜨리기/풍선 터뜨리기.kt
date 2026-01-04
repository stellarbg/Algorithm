import java.util.*
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine()?.toInt() ?: return
    val st = StringTokenizer(br.readLine())

    val queue = ArrayDeque<Pair<Int, Int>>(n)
    for (i in 1..n) {
        queue.addLast(Pair(st.nextToken().toInt(), i))
    }

    val result = StringBuilder()

    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        val move = current.first
        val number = current.second
        result.append("$number ")

        if (queue.isEmpty()) break

        if (move > 0) {
            repeat(move - 1) {
                queue.addLast(queue.removeFirst())
            }
        } else {
            repeat(abs(move)) {
                queue.addFirst(queue.removeLast())
            }
        }
    }

    println(result.toString().trim())
}