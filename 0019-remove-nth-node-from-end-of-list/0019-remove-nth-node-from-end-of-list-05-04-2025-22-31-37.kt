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
        /*
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
*/
        var count = 0
        
        var dummy = ListNode(-1)
        dummy.next = head
        
        var tmp: ListNode? = dummy.next
        
        while(tmp != null){
            count++
            tmp = tmp?.next
        }
        
        var pos = count - n
        
        tmp = dummy
        
        while(pos > 0){
            tmp = tmp?.next
            pos--
        }
        
        tmp?.next = tmp?.next?.next
        
        return dummy.next
    }
}