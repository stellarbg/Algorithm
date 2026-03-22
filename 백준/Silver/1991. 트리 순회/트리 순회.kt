import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val graph = mutableMapOf<String, Pair<String, String>>()

    repeat(n) {
        val node = sc.next()
        val left = sc.next()
        val right = sc.next()

        graph[node] = left to right
    }

    val sb = StringBuilder()

    fun preOrder(node: String) {
        if (node == ".") return
        val (left, right) = graph[node]!!

        sb.append(node)
        preOrder(left)
        preOrder(right)
    }

    fun inOrder(node: String) {
        if (node == ".") return
        val (left, right) = graph[node]!!

        inOrder(left)
        sb.append(node)
        inOrder(right)
    }

    fun postOrder(node: String) {
        if (node == ".") return
        val (left, right) = graph[node]!!

        postOrder(left)
        postOrder(right)
        sb.append(node)
    }

    preOrder("A")
    sb.append("\n")

    inOrder("A")
    sb.append("\n")

    postOrder("A")
    sb.append("\n")

    println(sb)
}