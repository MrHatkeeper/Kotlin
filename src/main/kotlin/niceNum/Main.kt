package niceNum

fun main(){
    coolNum(readLine()!!.toInt())
}


fun coolNum(num: Int){
    for(i in 0..num){
        var count = 0
        for(j in 1 until num){
            if(i % j == 0){
                count += j
            }
        }
        println(count)
    }
}