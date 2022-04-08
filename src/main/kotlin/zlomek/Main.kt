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

    operator fun plus(other: Zlomek): Zlomek{
        val gcd = this.secondNumber * other.secondNumber
        return Zlomek((this.firstNum *  divZ(this.secondNumber, gcd)) + (other.firstNum * divZ(other.secondNumber, gcd)), gcd)
    }

    operator fun minus(other: Zlomek): Zlomek{
        val gcd = this.secondNumber * other.secondNumber
        return Zlomek((this.firstNum *  divZ(this.secondNumber, gcd)) - (other.firstNum * divZ(other.secondNumber, gcd)), gcd)
    }

    operator fun times(other: Zlomek): Zlomek{
        return Zlomek(this.firstNum * other.firstNum, this.secondNumber * other.secondNumber)
    }

    operator fun div(other: Zlomek): Zlomek{
        val reversedZlomek = Zlomek(other.secondNumber, other.firstNum)
        return Zlomek(this.firstNum * reversedZlomek.firstNum, this.secondNumber * reversedZlomek.secondNumber)
    }

    operator fun compareTo(other: Zlomek): Int{
        val gcd = this.secondNumber * other.secondNumber
        val secondZlomek = Zlomek((other.firstNum * divZ(other.secondNumber, gcd)),gcd)
        val firstZLomek = Zlomek((this.firstNum *  divZ(this.secondNumber, gcd)),gcd)

        return if(firstZLomek.firstNum > secondZlomek.firstNum) 1
        else if(firstZLomek.firstNum < secondZlomek.firstNum) -1
        else 0
    }

    private fun divZ(value: Int, gcd: Int): Int{
        return gcd/value
    }

    override operator fun equals(other: Any?): Boolean {
        return super.equals(other)
    }


    fun toDouble(): Double = (firstNum/secondNumber).toDouble()

}


