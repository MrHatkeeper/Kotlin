package hashish

fun main(){
    val idk = Hash<Int>()

    idk.add(5)
    idk.add(2)
    println(idk.hash[0])
    println(idk.hash[1])
    println(idk.size())

}
