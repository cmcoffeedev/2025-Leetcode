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
        // we want to have "dummy" node so we can return the head later 
        var dummy = ListNode(-1)
        //set next to head, after finding the position, we can remove it
        dummy.next = head
        
        //count of nodes
        var count = 0
        
        //use tmp pointer
        var tmp = head

        //count nodes
        while(tmp != null){
            count++
            tmp = tmp.next
        } 
        
        //the number of nodes minus the nth pos from the end will give use the node before the one we want to remove
        var pos = count - n
        
        //start tmp at dummy, we are going to 
        tmp = dummy


        /*
            tmp = -1
            pos 3
    
            tmp = 1
            pos 2
    
            tmp = 2
            pos 1
    
            tmp = 3
            pos 0
        
            iterate up to pos before one we want to remove
        */
        while(pos > 0){
            tmp = tmp?.next
            pos--
        }
        
        //the node we want to remove next will be the previous node's next. at this point tmp is the prev node
        tmp?.next = tmp?.next?.next 
        
        // dummy's next is the head
        return dummy.next
    }
}