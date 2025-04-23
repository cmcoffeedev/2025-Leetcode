/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode middle = getMiddle(head);
        ListNode midReversed = reverse(middle);
        ListNode tmp = head;
        
        while(tmp != null && midReversed != null){
            if(tmp.val != midReversed.val) return false;
            tmp = tmp.next;
            midReversed = midReversed.next;
        }
        
        return true;
    }
    
    public ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode tmp = head;
        ListNode prev = null;
        while(tmp != null){
            ListNode next = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = next;
        }
        return prev;
    }


    
}