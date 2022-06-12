package testik

import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {

    val primes = sequence {
        var v = 2
        var previousPrimes = sequenceOf<Int>()
        while (true) {
            if (primeNums(v, previousPrimes)) {
                println("V je $v")
                previousPrimes += sequenceOf(v)

            }
            yield(v)
            v++
        }
    }

    var breakP = 1
    for (v in primes) {
        breakP++
        if (breakP == 100) break
    }


}


fun primeNums(v: Int, previousPrimes: Sequence<Int>): Boolean {
    for (i in previousPrimes) {
        val divider = sqrt(i.toDouble()).roundToInt()
        if (v % divider == 0 && divider != 1) {
            return false
        }
    }
    return true
}
