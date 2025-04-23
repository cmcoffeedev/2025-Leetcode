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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
       ListNode dummy = new ListNode(-1);
       dummy.next = head; 
       ListNode tmp = head;
       int count = 0;
        
       while(tmp != null){
           count++;    
           tmp = tmp.next;
       }   
        
       tmp = dummy;
       int pos = count - n;
       
       while(pos > 0){
           tmp = tmp.next;
           pos--;
       }   
        
       tmp.next = tmp.next.next;

       return dummy.next; 
    }
}