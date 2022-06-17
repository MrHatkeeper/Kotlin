package testik
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {

    val primes = sequence {
        var v = 2
        val previousPrimes = mutableListOf<Int>()
        while (true) {
            if (isPrime(v, previousPrimes)) {
                println("V je $v")
                previousPrimes.add(v)
                yield(v)
            }
            v++
        }
    }


    var breakP = 1
    for (v in primes) {
        breakP++
        if (breakP == 100) break
    }


}


fun isPrime(v: Int, previousPrimes: List<Int>): Boolean {
    for (i in previousPrimes) {
        val divider = sqrt(i.toDouble()).roundToInt()
        if (v % divider == 0 && divider != 1) {
            return false
        }
    }
    return true
}
