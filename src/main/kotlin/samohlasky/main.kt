package samohlasky

fun main() {
    println("Kolik slov")
    val inputs = readLine()!!.toInt()
    val inputsToMap = mutableMapOf<String, Int>()

    for (i in 0 until inputs) {
        println("Slovo")
        val word = readLine()!!
        inputsToMap[word] = word.count {
            it == 'a' || it == 'e' || it == 'i'
                    || it == 'o' || it == 'u'
        }
    }
    while (true) {
        println("Kolik samohlásek")
        val vowels = readLine()
        if (vowels == "end") {
            break
        }
        inputsToMap.filter { it.value == vowels!!.toInt() }.forEach { print(it.key + " ") }
        println("\n")
    }

}