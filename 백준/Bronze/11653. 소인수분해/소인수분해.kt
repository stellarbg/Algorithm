fun main() {
    var n = readln().toInt()
    var div = 2

    while (n > 1) {
        if (n % div == 0) {
            println(div)
            n /= div
        } else {
            div++
        }
    }
}