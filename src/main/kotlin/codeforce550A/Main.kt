package codeforce550A

fun main(){
    val input = "ABA"
    var ab = false
    var ba = false
    var i = 0

    while (i < input.length - 1){
        if(input[i] == 'A' && !ab){
            if(input[i + 1] == 'B'){
                i++
                ab = true
            }
        }
        else if(input[i] == 'B' && !ba){
            if(input[i + 1] == 'A'){
                i++
                ba = true
            }
        }
        if(ab && ba){
            println("YES")
            break
        }
        i++
    }
}