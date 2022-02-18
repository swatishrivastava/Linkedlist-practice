fun main(args: Array<String>) {
    //create linkedlist
    var list = LinkedList()
    list.addNodeInLinkedList(Node(0, null))
    list.addNodeInLinkedList(Node(1, null))
    list.addNodeInLinkedList(Node(2, null))

    var list2 = LinkedList()
    list2.addNodeInLinkedList(Node(1, null))
    list2.addNodeInLinkedList(Node(3, null))
    list2.addNodeInLinkedList(Node(4, null))

   // println("Our list = ${list.head.toString()}")


   // var rever = reverseLinkedList(list.head!!)

//    println("Reverse list = ${rever.toString()}")
   // println(" Linkedlist is palindrome "+isLinkedListPalindrome(list.head!!))
    //removeElements(list.head!!, 6)
   // println("List after delete: "+ removeNthNodeFromLast(list.head!!, 1))

   // println("Merged list: ${mergeTwoLists(list.head, list2.head)}")

    println("Rotate list: ${rotateList(Node(0, null), 4)}")
}