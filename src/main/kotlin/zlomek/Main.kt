package zlomek
fun main(){
    val numOne = Zlomek(1,4)
    val numTwo = Zlomek(1,2)
    println(numOne+ numTwo)
    /*println(minus(numOne, numTwo))
    println(timesZlomek(numOne, numTwo))
    println(devide(numOne, numTwo))*/
}


data class Zlomek(var firstNum: Int, var secondNumber: Int){

    operator fun plus(secondZlomek: Zlomek): Zlomek{
        val gcd = this.secondNumber * secondZlomek.secondNumber
        return Zlomek((this.firstNum *  times(this.secondNumber, gcd)) + (secondZlomek.firstNum * times(secondZlomek.secondNumber, gcd)), gcd)
    }

    fun minus(firstZlomek: Zlomek, secondZlomek: Zlomek): Zlomek{
        val gcd = firstZlomek.secondNumber * secondZlomek.secondNumber
        return Zlomek((firstZlomek.firstNum *  times(firstZlomek.secondNumber, gcd)) - (secondZlomek.firstNum * times(secondZlomek.secondNumber, gcd)), gcd)
    }

    fun timesZlomek(firstZlomek: Zlomek, secondZlomek: Zlomek): Zlomek{
        return Zlomek(firstZlomek.firstNum * secondZlomek.firstNum, firstZlomek.secondNumber * secondZlomek.secondNumber)
    }

    fun divide(firstZlomek: Zlomek, secondZlomek: Zlomek): Zlomek{
        val reversedZlomek = Zlomek(secondZlomek.secondNumber, secondZlomek.firstNum)
        return Zlomek(firstZlomek.firstNum * reversedZlomek.firstNum, firstZlomek.secondNumber * reversedZlomek.secondNumber)
    }

    fun compareTo(){

    }


    fun times(value: Int, gcd: Int): Int{
        return gcd/value
    }

}


