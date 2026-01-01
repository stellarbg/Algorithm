import java.util.Stack

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val input = readln()
        val stack = Stack<Char>()
        var isValid = true

        for (char in input) {
            if (char == '(') {
                stack.add(char)
            } else {
                if (stack.isEmpty()) {
                    isValid = false
                    break
                } else {
                    stack.pop()
                }

            }
        }

        if (isValid && stack.isEmpty()) {
            println("YES")
        } else {
            println("NO")
        }
    }
}