package primNum

fun main() {
    val num = readLine()!!.toInt()

    for (i in 2..num) {
        if (primNum(i))
            println("$i")

    }
}

fun primNum(num: Int): Boolean {
    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}