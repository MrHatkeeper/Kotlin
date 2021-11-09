package primNum

fun main(){
    val input = readLine()!!.toInt()
    prime(input)

}

fun prime(num: Int) : Int{
    for(i in 2..num / 2){
        if(num % i == 0) println(i)
    }
    return -1
}