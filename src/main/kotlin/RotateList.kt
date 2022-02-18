fun rotateList(node: Node<Int>, k: Int): Node<Int> {

    if (node == null) {
        return node
    }
    var slow = Node(0, node)
    var tempNode = node
    var tempNode2 = node
    var count =0

    var fast = node
    var tempCount = k

    while (tempNode2.next != null) {
        tempNode2 = tempNode2.next!!
        tempCount++
    }

    if(tempCount>0){
         count = k % tempCount
    }


    while (count != 0) {
        while (fast.next != null) {
            fast = fast.next!!
            slow = slow.next!!
        }
        slow.next = null
        fast.next = tempNode
        tempNode = fast
        slow = Node(0, tempNode)

        count--
    }

    println("Rotated List: $fast")

    return fast
}