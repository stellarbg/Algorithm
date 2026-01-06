fun main() {
    val n = readln().toInt()
    val input = readln()
    val values = DoubleArray(n) { readln().toDouble() }

    val deque = ArrayDeque<Double>()

    for (c in input) {
        if (c in 'A' .. 'Z') {
            deque.add(values[c - 'A'])
        } else {
            val second = deque.removeLast()
            val first = deque.removeLast()

            when (c) {
                '+' -> deque.addLast(first + second)
                '-' -> deque.addLast(first - second)
                '*' -> deque.addLast(first * second)
                '/' -> deque.addLast(first / second)
            }
        }
    }

    println("%.2f".format(deque.first()))
}