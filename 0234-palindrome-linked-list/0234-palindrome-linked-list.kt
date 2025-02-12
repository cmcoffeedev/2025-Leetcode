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
    fun isPalindrome(head: ListNode?): Boolean {
        var middle = findMiddle(head)
        var reversedMiddle = reverseList(middle?.next)
        var tmp = head
        while(tmp != null && reversedMiddle != null){
            if(tmp?.`val` != reversedMiddle?.`val`)return false
            tmp = tmp?.next
            reversedMiddle = reversedMiddle?.next
        }
        return true
        
    }
    
    private fun reverseList(head:ListNode?): ListNode?{
        var tmp = head
        var prev : ListNode? = null
        while(tmp != null){
            val next = tmp?.next
            tmp?.next = prev
            prev = tmp
            tmp = next
        }
        return prev
    }
    
    private fun findMiddle(head:ListNode?): ListNode?{
        var slow = head
        var fast = head?.next
        while(fast?.next != null && fast?.next?.next != null){
            slow = slow?.next
            fast = fast?.next?.next
        }
        return slow
    }


}