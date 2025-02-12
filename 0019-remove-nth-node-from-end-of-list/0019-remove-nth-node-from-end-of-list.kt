/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        
        var dummy = ListNode(-1)
        dummy.next = head
        
        var count = 0
        var tmp = dummy.next
        while(tmp != null){
            tmp = tmp.next
            count++
        }
        
        var pos = count - n
        tmp = dummy
        
        while(pos >  0){
            tmp = tmp.next
            pos--
        }
        
        tmp.next = tmp.next.next
        return dummy.next
        

    }
}