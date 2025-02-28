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
        var tmp = head
        var mid = findMiddle(tmp)
        var reversedMid = reverseList(mid)
        tmp = head
        while(tmp != null && reversedMid != null){
            if(tmp?.`val` != reversedMid?.`val`) return false
            tmp = tmp?.next
            reversedMid = reversedMid?.next
        }
        return true
    }

    fun findMiddle(head: ListNode?): ListNode?{
        var slow = head 
        var fast = head 
        while(fast != null && fast?.next != null){
            slow = slow?.next
            fast = fast?.next?.next
        }
        return slow
    }

    fun reverseList(head: ListNode?): ListNode?{
        var tmp = head
        var prev: ListNode? = null
        while(tmp != null){
            val next = tmp?.next
            tmp?.next = prev
            prev = tmp
            tmp = next
        }
        return prev
    }
}