package sekvence

fun main(){
    for(i in primeNumsIn100(100)){
        println(i)
    }
}


fun primeNumsIn100(max: Int) = sequence<Int> {
    for(v in 1..max){
        if(primeNumsCalcu(v)){
            yield(v)
        }
    }
}

fun primeNumsCalcu(value: Int): Boolean{
    for(i in value-1 downTo 2){
        if(value % i == 0){
            return false
        }
    }
    return true
}

fun primeNumsTill100(max: Int) = sequence<Int> {
TODO()

}

