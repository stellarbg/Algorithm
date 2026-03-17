import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val parent = IntArray(n + 1)
    val visited = BooleanArray(n + 1)

    repeat(n - 1) {
        val u = sc.nextInt()
        val v = sc.nextInt()

        graph[u].add(v)
        graph[v].add(u)
    }

    val queue = ArrayDeque<Int>()
    queue.add(1)
    visited[1] = true

    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()

        for (next in graph[current]) {
            if (!visited[next]) {
                visited[next] = true
                parent[next] = current
                queue.add(next)
            }
        }
    }

    val sb = StringBuilder()

    for (i in 2..n) {
        sb.append(parent[i]).append("\n")
    }

    println(sb)
}