fun main() {
    val br = System.`in`.bufferedReader()

    val map = mutableMapOf<String, Int>()
    var totalCount = 0

    while (true) {
        val name = br.readLine() ?: break
        map[name] = map.getOrDefault(name, 0) + 1
        totalCount++
    }

    val sortedKeys = map.keys.toMutableList()
    sortedKeys.sort()

    for (name in sortedKeys) {
        val count = map[name]!!
        val percentage = (count.toDouble() * 100) / totalCount
        println("$name ${String.format("%.4f", percentage)}")
    }
}
