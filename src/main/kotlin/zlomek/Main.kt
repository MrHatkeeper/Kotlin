package zlomek
fun main(){
    val numOne = Zlomek(1,4)
    val numTwo = Zlomek(1,2)
    println(numOne+numTwo)
    println(numOne-numTwo)
    println(numOne*numTwo)
    println(numOne/numTwo)
    println(numOne<numTwo)
    println(numOne==numTwo)
    println(numOne.toDouble())

}


data class Zlomek(var firstNum: Int, var secondNumber: Int){

    operator fun plus(secondZlomek: Zlomek): Zlomek{
        val gcd = this.secondNumber * secondZlomek.secondNumber
        return Zlomek((this.firstNum *  timesZ(this.secondNumber, gcd)) + (secondZlomek.firstNum * timesZ(secondZlomek.secondNumber, gcd)), gcd)
    }

    operator fun minus(secondZlomek: Zlomek): Zlomek{
        val gcd = this.secondNumber * secondZlomek.secondNumber
        return Zlomek((this.firstNum *  timesZ(this.secondNumber, gcd)) - (secondZlomek.firstNum * timesZ(secondZlomek.secondNumber, gcd)), gcd)
    }

    operator fun times(secondZlomek: Zlomek): Zlomek{
        return Zlomek(this.firstNum * secondZlomek.firstNum, this.secondNumber * secondZlomek.secondNumber)
    }

    operator fun div(secondZlomek: Zlomek): Zlomek{
        val reversedZlomek = Zlomek(secondZlomek.secondNumber, secondZlomek.firstNum)
        return Zlomek(this.firstNum * reversedZlomek.firstNum, this.secondNumber * reversedZlomek.secondNumber)
    }

    operator fun compareTo(secondZlomek: Zlomek): Int{
        val gcd = this.secondNumber * secondZlomek.secondNumber
        val secondZlomek = Zlomek((secondZlomek.firstNum * timesZ(secondZlomek.secondNumber, gcd)),gcd)
        val firstZLomek = Zlomek((this.firstNum *  timesZ(this.secondNumber, gcd)),gcd)

        return if(firstZLomek.firstNum > secondZlomek.firstNum) 1
        else if(firstZLomek.firstNum < secondZlomek.firstNum) -1
        else 0
    }

    private fun timesZ(value: Int, gcd: Int): Int{
        return gcd/value
    }

    fun toDouble(): Double = (firstNum/secondNumber).toDouble()

}


