package arraylist

class LidlArrayList<T>(private var numbers: Array<T>) {


    fun size(): Int {
        return numbers.size
    }

    fun isEmpty(): Boolean {
        return numbers.isEmpty()
    }

    fun indexOf(number: T): Int {
        for (i in numbers.indices) {
            if (numbers[i] == number) return i
        }
        return -1
    }

    fun toArray(): Array<T> {
        return numbers
    }

    fun get(pos: Int): T {
        return if (pos < numbers.size) numbers[pos]
        else throw Exception("lmao není")
    }

    fun add(num: T) {
        val newArr = numbers + num
        numbers = newArr
    }

    fun set(pos: Int, num: T) {
        numbers[pos] = num
    }

    fun contains(num: T): Boolean {
        for (i in numbers.indices) {
            if (numbers[i] == num) return true
        }
        return false
    }

    fun lastIndexOf(num: T): Int {
        for (i in numbers.size - 1 downTo 0)
            if (numbers[i] == num) {
                return i
            }
        return -1
    }
}