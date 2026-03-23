fun main() {
    val m = readln().toInt()
    val n = readln().toInt()

    val primeList = mutableListOf<Int>()

    for (num in m..n) {
        if (num < 2) continue

        var isPrime = true

        for (i in 2 until num) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            primeList.add(num)
        }
    }

    if (primeList.isEmpty()) {
        println(-1)
    } else {
        println(primeList.sum())
        println(primeList.min())
    }
}