data class Node<T : Any>(var value: T, var next: Node<T>?) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}