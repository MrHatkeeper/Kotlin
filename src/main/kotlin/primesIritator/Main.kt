package primesIritator


fun main() {
    val primesNumber = Iterable { PrimeIterator(1000) }.filterNotNull()
    primesNumber.forEach { println(it)}
}

class PrimeIterator(private val maxNum: Int) : Iterator<Int?> {
    private var counter = 0
    override fun hasNext(): Boolean = counter < maxNum

    override fun next(): Int? {
        check(hasNext()) { "Idk ende šlus lol" }
        counter++
        return if (isPrime(counter)) counter
        else null
    }
}

fun isPrime(num: Int): Boolean {
    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}

