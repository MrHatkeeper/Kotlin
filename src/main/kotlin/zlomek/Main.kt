package zlomek
fun main(){
    val numOne = Zlomek("1/2")
    val numTwo = Zlomek("1/2")

}


data class Zlomek(var num: String){
    var values = arrayListOf(num.split("/")[0].toInt(),num.split("/")[1].toInt())
    
    fun plus(firstZlomek: Zlomek, secondZlomek: Zlomek){
        var gcd = gcd(firstZlomek.values[1], secondZlomek.values[1])
    }


    fun gdc(firstNum: Int, secondNum: Int): Int{
        var numOne = firstNum
        var numTwo = secondNum

        while (numOne != numTwo) {
            if (numOne > numTwo)
                numOne -= numTwo
            else
                numTwo -= numOne
        }

        return numOne
    }

}