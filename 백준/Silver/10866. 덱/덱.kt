import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()
    val queue = ArrayDeque<Int>()

    repeat(n) {
        val st = StringTokenizer(readln())

        when (st.nextToken()) {
            "push_front" -> {
                val num = st.nextToken().toInt()
                queue.addFirst(num)
            }

            "push_back" -> {
                val num = st.nextToken().toInt()
                queue.addLast(num)
            }

            "pop_front" -> {
                if (queue.isEmpty()) println(-1) else println(queue.removeFirst())
            }

            "pop_back" -> {
                if (queue.isEmpty()) println(-1) else println(queue.removeLast())
            }

            "size" -> {
                println(queue.size)
            }

            "empty" -> {
                if (queue.isEmpty()) println(1) else println(0)
            }

            "front" -> {
                if (queue.isEmpty()) println(-1) else println(queue.first())
            }

            "back" -> {
                if (queue.isEmpty()) println(-1) else println(queue.last())
            }

        }
    }
}