package countAllNum

fun main() {
    val input = readLine()
    var out = 0
    if (input != null) {
        for (i in input.indices) {
            if (input[i].isDigit()) out += input[i].digitToInt()
        }
    }
    println(out)
}
