package leetcode

class DeleteNodeLinkedList {
    fun deleteNode(node: ListNode?) {
        var temp = node
        temp?.`val` = temp?.next?.`val`!!
        temp.next = temp?.next?.next
    }
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
