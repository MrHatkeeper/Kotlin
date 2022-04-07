package hashish

class Hash<T> {
    var hash = Array(2){mutableListOf<T>()}


    fun add(value: T): Boolean {
        if (!has(value)) {
            return when (value.hashCode() % 2) {
                0 -> {
                    hash[0].add(value)
                    true
                }
                else -> {
                    hash[1].add(value)
                    true
                }
            }
        }
        return false
    }

    fun has(value: T): Boolean {
        when (value.hashCode() % 2) {
            0 -> {
                if(hash[0].contains(value)) return true
            }
            else -> {
                if(hash[1].contains(value)) return true
            }
        }
        return false
    }

    fun delete(value: T): Boolean {
        if (has(value)) {
            return when (value.hashCode() % 2) {
                0 -> {
                    hash.elementAt(0).remove(value)
                    true
                }
                else -> {
                    hash.elementAt(1).remove(value)
                    true
                }
            }
        }
        return false
    }

    fun size(): Int {
        return (hash[0].size + hash[1].size)
    }

    fun iterator(value: T) {

    }
}