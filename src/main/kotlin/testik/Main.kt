package sekvence

import java.util.LinkedList
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {


    val primes = sequence {
        var v = 2
        val previousPrimes = LinkedList<Int>()
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

//zjišťuje, zda číslo je prvočíslo nebo ne
fun isPrime(v: Int, previousPrimes: LinkedList<Int>): Boolean {

    return  previousPrimes.asSequence()
        .takeWhile { it <= (sqrt(v.toDouble()).roundToInt())}
        .none { v % it == 0 }
}
