package countAll

fun main() {
    val input = readLine()
    var out = 0
    if (input != null) {
        for (i in input.indices) {
            if (i % 2 == 0 && input[i].digitToInt() % 3 == 0) out += input[i].digitToInt()
        }
    }
    println(out)
}