package countOnIn

fun main(){
    var large = 0;
    var small = 0;

    while(true){
        val num = readLine()?.toInt()
        if(num!! > large){
            large = num
        }
        if(num < small){
            small = num
        }
    }
    println("biggest = $large smallest = $small");

}