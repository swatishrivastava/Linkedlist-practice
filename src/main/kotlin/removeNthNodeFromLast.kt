fun removeNthNodeFromLast(node: Node<Int>, n: Int): Node<Int> {
    var dummy: Node<Int> = Node(0, node)
    var slow: Node<Int>? = dummy
    var fast: Node<Int>? = node

    var len = 0

    while (fast!=null){
        len++
        fast = fast?.next
    }

    if(len ==1){
        return Node(0, null)
    }
    var count = n
    while (count > 0) {
        fast = fast?.next
        count--
    }

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast?.next
    }

    slow?.next?.next= slow?.next?.next?.next
    return dummy.next!!

}