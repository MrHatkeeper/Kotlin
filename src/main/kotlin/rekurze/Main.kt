package rekurze

fun add(requiredNum: Int, num: Int = 1): Int {
    return if (requiredNum != num) add(requiredNum, num + 1)
    else return num
}

fun basicMultiply(timer: Int, timesBy: Int, result: Int = timer): Int {
    return if ((timer * timesBy) != result) basicMultiply(timer, timesBy, result + timer)
    else return result
}

fun power(number: Int, powerOn: Int, result: Int = number): Int{
    return if (powerOn > 1) power(number, powerOn-1, result * number)
    else return result
}

fun sumNums(addNumber: String, actualNumbers: String): String{
    return if (addNumber.isNotEmpty()){
        val newActualNumbers = addNumber[0] + actualNumbers
        sumNums(addNumber.substring(1), newActualNumbers)
    }
    else return actualNumbers
}

fun palindrome(word: String, palindrome: String = "", position:Int = 0): String{
    return if (palindrome.length < word.length){
        val newPalindrome = word[position] + palindrome
        palindrome(word, newPalindrome, position + 1)
    }
    else return palindrome
}

