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
    public ListNode removeElements(ListNode head, int val) {
       //if the list is not empty and head value is equals to the target val keep moving head
        while(head != null && head.val == val){
            head = head.next;  
        }

        ListNode current = head;
        //until the current is not pointing at the end of list and current.next is not null 
        while(current != null && current.next != null){
            if(current.next.val == val){    //check if current.next val matches with the target value and if it does just point that node to the next node
                current.next = current.next.next;
            } else{
            current = current.next; //if value doesnt match just move one node 
            }
        }
        return head;
    }
}