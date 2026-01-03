fun main() {
    val n = readln().toInt()

    val queue = ArrayDeque((1..n).toList().reversed())

    while (queue.size != 1) {
        queue.removeLast()
        queue.addFirst(queue.removeLast())
    }

    println(queue.first())
}