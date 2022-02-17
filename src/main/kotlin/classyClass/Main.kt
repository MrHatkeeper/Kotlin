package classyClass

fun main() {
    val input = readLine()!!.split(" ")
    val map: MutableMap<String, Any> = mutableMapOf(
        "+" to Plus().porvedOperaci(input[0].toFloat(), input[2].toFloat()),
        "-" to Minus().porvedOperaci(input[0].toFloat(), input[2].toFloat()),
        "*" to Times().porvedOperaci(input[0].toFloat(), input[2].toFloat()),
        "/" to Divide().porvedOperaci(input[0].toFloat(), input[2].toFloat())

    )

    println(map[input[1]])


}

interface Operators{
    fun porvedOperaci(firstNum: Float, secondNum: Float): Float
}


class Plus: Operators {
    override fun porvedOperaci(firstNum: Float, secondNum: Float): Float = firstNum + secondNum
}

class Minus: Operators {
    override fun porvedOperaci(firstNum: Float, secondNum: Float): Float = firstNum - secondNum
}

class Times: Operators{
    override fun porvedOperaci(firstNum: Float, secondNum: Float): Float = firstNum * secondNum
}

class Divide: Operators {
    override fun porvedOperaci(firstNum: Float, secondNum: Float): Float = firstNum / secondNum
}