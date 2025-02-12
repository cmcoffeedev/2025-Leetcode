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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        var dummy = ListNode(-1)
        var merged : ListNode? = dummy

        var list1tmp = list1
        var list2tmp = list2

        while(list1tmp != null && list2tmp != null){
            if(list1tmp.`val` < list2tmp.`val`){
                merged?.next = list1tmp
                merged = merged?.next
                list1tmp = list1tmp.next
            }
            else{
                merged?.next = list2tmp
                merged = merged?.next
                list2tmp = list2tmp.next
            }
        }

        merged?.next = if(list1tmp != null) list1tmp else list2tmp

        return dummy.next
    }
}