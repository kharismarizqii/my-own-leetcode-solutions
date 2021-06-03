package leetcode

class RemoveLinkedListElement {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var newHead = head
        var prev: ListNode? = null
        var temp = head
        while (temp != null && temp?.`val` == `val`) {
            newHead = temp?.next
            temp = newHead
        }
        while(temp!=null){
            if(temp.`val` != `val`){
                prev = temp
                temp = temp?.next
            } else {
                prev?.next = temp?.next
                temp = temp?.next
            }
        }
        return newHead
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

