import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()
    val stack = mutableListOf<Int>()

    repeat(n) {
        val st = StringTokenizer(readln())

        when (st.nextToken()) {
            "push" -> {
                val num = st.nextToken().toInt()
                stack.add(num)
            }

            "pop" -> {
                if (stack.isEmpty()) println(-1) else println(stack.removeLast())
            }

            "size" -> {
                println(stack.size)
            }

            "empty" -> {
                if (stack.isEmpty()) println(1) else println(0)
            }

            "top" -> {
                if (stack.isEmpty()) println(-1) else println(stack.last())
            }
        }
    }
}