import java.util.StringTokenizer

fun main() {

    val t = readln().toInt()

    repeat(t) {
        val st1 = StringTokenizer(readln())
        val n = st1.nextToken().toInt()
        val m = st1.nextToken().toInt()

        val st2 = StringTokenizer(readln())

        val queue = ArrayDeque<Pair<Int, Int>>(n)

        for (i in 0 until n) {
            queue.add(Pair(i, st2.nextToken().toInt()))
        }

        var printCount = 0

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            if (queue.any { it.second > current.second }) {
                queue.addLast(current)
            } else {
                printCount++

                if (current.first == m) {
                    println(printCount)
                    break
                }
            }
        }
    }
}