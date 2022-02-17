



fun reverseLinkedList(node: Node<Int>): Node<Int> {
    var prev: Node<Int>? = null
    var curr = node

    while (curr.next != null) {
        var next = curr.next
        curr.next = prev
        prev = curr
        curr = next!!
    }

    curr.next = prev!!

    return curr
}