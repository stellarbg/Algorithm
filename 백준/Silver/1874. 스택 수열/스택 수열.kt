import java.util.Stack

fun main() {
    val n = readln().toInt()
    val stack = Stack<Int>()
    val result = StringBuilder()

    var currentNum = 1
    var possible = true

    repeat(n) {
        val target = readln().toInt()

        if (possible) {
            while (currentNum <= target) {
                stack.push(currentNum)
                result.append("+\n")
                currentNum++
            }

            if (stack.peek() == target) {
                stack.pop()
                result.append("-\n")
            } else {
                possible = false
            }
        }
    }

    if (possible) {
        println(result)
    } else {
        println("NO")
    }
}