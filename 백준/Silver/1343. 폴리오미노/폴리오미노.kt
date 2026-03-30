fun main() {
    val input = readln()

    var result = input.replace("XXXX", "AAAA")
    result = result.replace("XX", "BB")

    if (result.contains("X")) {
        println("-1")
    } else {
        println(result)
    }
}