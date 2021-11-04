package sumAvNum

fun main() {
    val input = mutableListOf<Int>()
    var avg = 0
    val output = mutableListOf<Int>()

    while (true) {
        val inpt = readLine()
        if(inpt.equals("end")) break
        else input.add(inpt!!.toInt())
    }


    for (i in input.indices) {
        avg += input[i]
    }
    avg /= input.size

    for (i in input.indices) {
        if (input[i] >= avg) {
            output.add(input[i])
        }
    }

    println(output.toString())
}
