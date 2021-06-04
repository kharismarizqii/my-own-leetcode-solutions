package leetcode

class RemoveDuplicateLinkedList {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var temp = head
        var prev : ListNode? = null
        while(temp!=null){
            if(temp?.`val`== prev?.`val`){
                prev?.next = temp?.next
            } else {
                prev = temp
            }
            temp = temp?.next
        }
        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}