package abortion

fun main() {
    val inputs = mutableListOf<Int?>()
    while (true) {
        val input = readLine()
        if (input == "END") break
        else inputs.add(input?.toIntOrNull())
    }

    var sumAllNumbers = 0

    for (i in inputs.indices) {
        if (inputs[i] == null) {
            var temporaryCountNull = 0
            for (j in (i - 2)..i + 2) {
                if (j != i) {
                    if (j != -1) temporaryCountNull += inputs[j]!!
                }
            }
            inputs[i] = kotlin.math.ceil(temporaryCountNull / 4.0).toInt()
        } else sumAllNumbers += inputs[i]!!
    }

    println(inputs)
}