import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val sb = StringBuilder()

    val n = sc.nextInt()

    val degree = IntArray(n + 1)

    repeat(n - 1) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        degree[a]++
        degree[b]++
    }

    val q = sc.nextInt()

    repeat(q) {
        val t = sc.nextInt()
        val k = sc.nextInt()

        when (t) {
            1 -> {
                if (degree[k] >= 2) {
                    sb.append("yes").append("\n")
                } else {
                    sb.append("no").append("\n")
                }
            }

            2 -> {
                sb.append("yes").append("\n")
            }
        }
    }

    println(sb)
}