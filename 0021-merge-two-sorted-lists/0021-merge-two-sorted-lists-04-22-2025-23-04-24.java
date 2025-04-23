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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        
        ListNode tmpOne = list1;
        ListNode tmpTwo = list2;
        ListNode tmp = dummy;
        
        while(tmpOne != null && tmpTwo != null){
            if(tmpOne.val < tmpTwo.val){
                tmp.next = tmpOne;
                tmpOne = tmpOne.next;
                tmp = tmp.next;
            }
            else{
                tmp.next = tmpTwo;
                tmpTwo = tmpTwo.next;
                tmp = tmp.next;
            }
        }
        
        if(tmpOne != null){
            tmp.next = tmpOne;
        } 
        else{
            tmp.next = tmpTwo;
        }
        
        return dummy.next;
    }
}