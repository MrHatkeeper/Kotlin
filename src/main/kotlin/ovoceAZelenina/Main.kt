package ovoceAZelenina


fun main(){

    println("Počet ovoce:")
    val addOvoce = readLine()!!.toInt()
    val ovoce = Array(addOvoce){""}
    println("Počet zeleniny:")
    val addZelenina = readLine()!!.toInt()
    val zelenina = Array(addZelenina){""}

    for (i in 0 until addOvoce) {
        println("Přidej ovoce")
        ovoce[i] = readLine()!!
    }
    for (i in 0 until addZelenina) {
        println("Přidej zeleninu")
        zelenina[i] = readLine()!!
    }

    while (true) {
        println("Co hledáš")
        val search = readLine()!!
        if (search == "END") {
            break
        }
        for (s in ovoce) {
            if (search == s) {
                println("Je to ovoce")
                break
            }
        }
        for (s in zelenina) {
            if (search == s) {
                println("Je to zelenina")
                break
            }
        }
    }

}