package zelenina2

fun main(){
    val input = mutableMapOf<String, String?>()


    println("Kolik věcí")
    var count = readLine()!!.toInt()
    for (i in 0 until count) {
        println("Přidat zeleninu")
        val word = readLine().toString()
        if (input[word] != null) {
            println("už tam jendou je")
            count++
        } else input[word] = "zelenina"
    }

    println("Kolik věcí")
    count = readLine()!!.toInt()
    for (i in 0 until count) {
        println("Přidat ovoce")
        val word = readLine().toString()
        if (input[word] != null) {
            println("už tam jendou je")
        } else input[word] = "ovoce"
    }

    while (true) {
        println("Co hledáš")
        val word = readLine().toString()
        if (word == "END") break
        if (input[word] == null) {
            println("ostatní")
        } else println(input[word])
    }
}
