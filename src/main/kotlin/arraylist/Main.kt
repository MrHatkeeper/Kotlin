package arraylist

fun main() {
    val arrayList = LidlArrayList(intArrayOf(1, 2, 3, 4, 5))
    println(arrayList.size())
    println(arrayList.isEmpty())
    println(arrayList.indexOf(2))
    println(arrayList.toArray())
    println(arrayList.get(4))
    arrayList.add(6)
    arrayList.set(0,2)
    println(arrayList.toArray().contentToString())
    println(arrayList.contains(5))
    println(arrayList.lastIndexOf(2))
}
