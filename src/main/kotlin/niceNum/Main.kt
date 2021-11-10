package niceNum

fun main() {
    val input = readLine()!!.toInt()

    for (i in 1..input) {
        if(coolNums(i)) println(i)
    }

}

fun coolNums(num: Int): Boolean {
    var check = 0
    for (i in 1 until num) {
        if (num % i == 0){
            check += i
        }
    }
    return check == num
}
