fun main() {
    val input = "12345213668"
    var output = 0
    var index = 0
    for (i in input) {
        index++
        if (i.digitToInt() % 3 == 0 && index % 2 == 0) {
            output += i.digitToInt()
        }
    }
    println(output)
}