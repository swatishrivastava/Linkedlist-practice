class LinkedList {
    var head:Node<Int>? = null

    fun addNodeInLinkedList(node: Node<Int>){
        if(this.head == null){
            this.head = node
            return
        }
        var curr = this.head
        while (curr?.next!=null){
            curr = curr.next
        }
        curr?.next = node
    }
}