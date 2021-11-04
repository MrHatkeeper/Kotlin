package uniNum

fun main(){

    val input = mutableListOf<Int>()

    
    
    while (true) {
        val inpt = readLine()
        if(inpt.equals("end")) break
        else input.add(inpt!!.toInt())
    }

    
    println(input.distinct().size)
    println(input.toString())

}