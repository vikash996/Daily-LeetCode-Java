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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
         return;
        }
        ListNode slow=head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode curr = head2;
        ListNode frw = null;
        while(curr!=null){
            frw= curr.next;
            curr.next=prev;
            prev=curr;
            curr=frw;
        }
        ListNode p1 = head;
        ListNode p2 = prev;
        while(p1 != null && p2 != null){
        ListNode next1 = p1.next;
        ListNode next2 = p2.next;
        p1.next = p2;
        p2.next = next1;
        p1 = next1;
        p2 = next2;
    }
 

        
    }
}