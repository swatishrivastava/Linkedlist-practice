fun isLinkedListPalindrome(node: Node<Int>): Boolean {
    var slow: Node<Int>? = node
    var fast: Node<Int>? = node

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast?.next?.next
    }
    fast = node
    var newNode = reverseLinkedList(slow!!)

    while (fast?.next != null && newNode.next !=null) {
        if (fast?.value != newNode.value) {
            return false
        }
        fast = fast?.next
        newNode = newNode?.next!!
    }

    if(fast?.value != newNode.value){
        return false
    }

    return true

}