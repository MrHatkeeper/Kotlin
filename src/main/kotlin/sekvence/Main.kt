package sekvence

fun main() {
    for (i in primeNumsIn100(100)) {
        println(i)
    }
    for (i in primeNumsTill100(100)){
        println(i)
    }
}


fun primeNumsIn100(max: Int) = sequence {
    for (v in 2..max) {
        if (primeNumsCalcu(v)) {
            yield(v)
        }
    }
}

fun primeNumsCalcu(value: Int): Boolean {
    for (i in value - 1 downTo 2) {
        if (value % i == 0) {
            return false
        }
    }
    return true
}

fun primeNumsTill100(max: Int) = sequence {
    var count = 0
    var v = 2
    while(count < max){
        if(primeNumsCalcu(v)){
            count++
            yield(v)
        }
        v++
    }

}

