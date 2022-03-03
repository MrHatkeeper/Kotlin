package primesIritator

fun main() {
    val primesNumber = Iterable { PrimeIterator(1000) }.filter { it != "Non prime number"}
    primesNumber.forEach { println(it)}
}

class PrimeIterator(private val maxNum: Int) : Iterator<String> {
    private var counter = 0
    override fun hasNext(): Boolean = counter < maxNum

    override fun next(): String {
        check(hasNext()) { "Idk ende šlus lol" }
        counter++
        return isPrime(counter)
    }
}

fun isPrime(num: Int): String {
    for (i in 2 until num) {
        if (num % i == 0) {
            return "Non prime number"
        }
    }
    return num.toString()
}

