fun main(args: Array<String>) {
    //create linkedlist
    var list = LinkedList()
    list.addNodeInLinkedList(Node(1, null))
    list.addNodeInLinkedList(Node(2, null))
    list.addNodeInLinkedList(Node(3, null))

    println("Our list = ${list.head.toString()}")


    var rever = reverseLinkedList(list.head!!)

    println("Reverse list = ${rever.toString()}")
}