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
        var mid = middle(head)
        var reversed = reverseList(mid)
        var tmp = head
        while(tmp != null && reversed != null){
            if(tmp.`val` != reversed.`val` ) return false
            tmp = tmp?.next
            reversed = reversed?.next
        }
        return true

    }

    fun reverseList(head: ListNode?): ListNode? {
        var tmp = head
        var prev: ListNode? = null
        while(tmp != null){
            val next = tmp.next
            tmp.next = prev
            prev = tmp
            tmp = next
        }
        return prev
    }

    fun middle(head: ListNode?): ListNode? {
       var slow = head 
       var fast = head?.next 
       while(fast != null && fast?.next != null){
        slow = slow?.next
        fast = fast?.next?.next
       }
       return slow
    }
}