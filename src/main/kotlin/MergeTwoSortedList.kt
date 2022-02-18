fun mergeTwoLists(list1: Node<Int>?, list2: Node<Int>?): Node<Int>? {
    var current = Node(0, null)
    var dummy = current
    var first = list1
    var sec = list2

    while (first?.next != null && sec?.next != null) {

        if (first?.value > sec?.value!!) {
            dummy.next = sec
            sec = sec.next

        }
        if (first?.value < sec?.value!!) {
            dummy.next = first
            first = first.next
        }
        if (first?.value == sec?.value) {
            dummy.next = Node(first.value, Node(sec.value, null))
            dummy = dummy.next!!
            first = first.next
            sec = sec.next
        }



        dummy = dummy.next!!

    }

    if(first?.value!=null){

    }


    return current.next
}