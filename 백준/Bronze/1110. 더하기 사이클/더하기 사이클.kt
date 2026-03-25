fun main() {
    val input = readln().toInt()
    var n = input
    var count = 0

    while (true) {
        val first = n / 10
        val second = n % 10
        val sum = first + second

        n = (second * 10) + (sum % 10)
        count++

        if (n == input) {
            break
        }
    }

    println(count)
}