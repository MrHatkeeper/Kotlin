package bankovky

fun main(){
    var input = readLine()!!.toInt()

    val bankovky = intArrayOf(5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1)
    var out = 0


    for (j in bankovky) {
        var possible = true
        while (possible) {
            if (input / j >= 1) {
                out += 1
                input -= j
            } else {
                possible = false
            }
        }
    }
    println(out)
}