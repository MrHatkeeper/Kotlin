package arraylist


fun main() {

    val arrayList = LidlArrayList(arrayOf(5,5,5,4,2))
    println(arrayList.size())
    println(arrayList.isEmpty())
    println(arrayList.indexOf(2))
    println(arrayList.toArray())
    println(arrayList.get(4))
    arrayList.add(6)
    arrayList.set(0, 2)
    println(arrayList.toArray().contentToString())
    println(arrayList.contains(5))
    println(arrayList.lastIndexOf(2))


}
