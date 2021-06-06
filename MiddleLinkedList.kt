package leetcode

class MiddleLinkedList {
    fun middleNode(head: ListNode?): ListNode? {
        var temp = head
        var nodeCount = 0
        while(temp!=null){
            nodeCount++
            temp = temp?.next
        }
        val mid = nodeCount/2+1
        var result = head
        for(i in 0 until mid-1){
            result = result?.next
        }
        return result
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}