import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()
    val queue = ArrayDeque<Int>()
    val sb = StringBuilder()

    repeat(n) {
        val st = StringTokenizer(readln())
        when (st.nextToken()) {
            "push" -> {
                queue.add(st.nextToken().toInt())
            }

            "pop" -> {
                sb.append(if (queue.isEmpty()) -1 else queue.removeFirst()).append("\n")
            }

            "size" -> {
                sb.append(queue.size).append("\n")
            }

            "empty" -> {
                sb.append(if (queue.isEmpty()) 1 else 0).append("\n")
            }

            "front" -> {
                sb.append(if (queue.isEmpty()) -1 else queue.first()).append("\n")
            }

            "back" -> {
                sb.append(if (queue.isEmpty()) -1 else queue.last()).append("\n")
            }
        }
    }

    print(sb)
}
