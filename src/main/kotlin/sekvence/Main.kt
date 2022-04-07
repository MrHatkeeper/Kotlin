package sekvence

fun main() {
    var max = 0
    for (i in primeNumsTo100()) {
        max += 1
        if (i != -1) {
            print("$i ")
        }
        if(max == 100) break
    }
    max = 0
    println()
    for (i in primeNumsTo100()) {
        if (i != -1) {
            max += 1
            print("$i ")
        }
        if(max == 100) break
    }
}


fun primeNums(v: Int): Int {
    for (i in v - 1 downTo 2) {
        if (v % i == 0) {
            return -1
        }
    }
    return v
}


fun primeNumsTo100() = sequence {
    var v = 0
    while (true) {
        v++
        yield(primeNums(v))
    }
}