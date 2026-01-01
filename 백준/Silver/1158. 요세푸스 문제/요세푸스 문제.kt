import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()

    val queue = ArrayDeque((1..n).toList())
    val result = mutableListOf<Int>()

    while (queue.isNotEmpty()) {
        repeat(k - 1) {
            queue.addLast(queue.removeFirst())
        }
        result.add(queue.removeFirst())
    }

    println(result.joinToString(separator = ", ", prefix = "<", postfix = ">"))
}