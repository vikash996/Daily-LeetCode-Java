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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast = head;
        while(fast.next!=null&& fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode head2 = slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr = head2;
        ListNode frw = null;
        while(curr!=null){
            frw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=frw;
        }
        ListNode i = head;
        ListNode j = prev;
        
        int max = 0;

        while(j != null){
            max = Math.max(max, i.val + j.val);
            i = i.next;
            j = j.next;
        }

        return max;

    }
}