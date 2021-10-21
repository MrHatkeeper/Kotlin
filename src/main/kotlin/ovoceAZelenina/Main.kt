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
        if (search == "END") break

        when (search) {
            in ovoce -> {
                println("Je to ovoce")
            }
            in zelenina -> {
                println("Je to zelenina")
            }
            else -> {
                println("NIC NEJSI... JSI JENOM CHYBA V SYSTÉMU, KTERÁ NIKDY NEBUDE MÍT VYUŽITÍ...")
            }
        }
    }

}