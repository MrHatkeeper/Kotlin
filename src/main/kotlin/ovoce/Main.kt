package ovoce

fun main(){
    val input = arrayOf(readLine()!!.split(", "))

    var duplicite = false
    for(i in input.indices){
        for(j in i..input.size){
            if(input[i] == input[j]){
                println(input[i])
                break;
            }
        }
    }

}