package cosmoNum

fun main(){
    val input = readLine()!!.toInt()

    for (i in 1..input) {
        if(moonWalkingNums(i.toString())) println(i)
    }
}

fun moonWalkingNums(num: String): Boolean {
    var output = 0
    for (i in num.indices){
        var mezi = 1
        for (j in num.indices){
            mezi *= Character.getNumericValue(num[i])
        }
        output += mezi
    }

    return num.toInt() == output

}
