// delete given node and do not have access to head
fun deleteNodeFromList(node:Node<Int>){
    node.value = node.next?.value!!
    node.next = node.next!!.next
}

fun removeElements(head: Node<Int>?, value: Int): Node<Int>? {
    var prev: Node<Int>? = null
    var curr: Node<Int>? = head

    while(curr?.next!=null){
        if(curr?.value == value){
            prev?.next = curr?.next?.next
        }
        //else{
//            prev = curr
//        }
        curr = curr?.next
    }

    if(curr?.value== value ){
        prev?.next = curr?.next
    }

    return curr
}