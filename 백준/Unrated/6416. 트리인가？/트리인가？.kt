import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var caseIdx = 1

    while (true) {
        val inDegree = mutableMapOf<Int, Int>()
        val nodes = mutableSetOf<Int>()
        var edgeCount = 0
        var isExited = false

        while (true) {
            val u = if (sc.hasNextInt()) sc.nextInt() else break
            val v = sc.nextInt()

            if (u == -1 && v == -1) {
                isExited = true
                break
            }

            if (u == 0 && v == 0) break

            nodes.add(u)
            nodes.add(v)
            inDegree[v] = inDegree.getOrDefault(v, 0) + 1
            edgeCount++
        }

        if (isExited) break

        val result = checkTree(nodes, inDegree, edgeCount)
        println("Case $caseIdx is ${if (result) "a tree" else "not a tree"}.")
        caseIdx++
    }
}

fun checkTree(nodes: Set<Int>, inDegree: Map<Int, Int>, edgeCount: Int): Boolean {
    if (nodes.isEmpty()) return true

    var roodCount = 0
    for (node in nodes) {
        val deg = inDegree[node] ?: 0
        if (deg == 0) roodCount++
        if (deg > 1) return false
    }

    return roodCount == 1 && edgeCount == nodes.size - 1
}