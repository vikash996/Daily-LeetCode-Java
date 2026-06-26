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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head ==  null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode pre = dummy;
        for(int i=0; i<left-1; i++){
            pre=pre.next;
        }
        ListNode curr=pre.next;
        ListNode a = null;
        ListNode frw = null;
        ListNode first = curr;
        int count = right - left +1;
        while(count > 0){
            frw=curr.next;
            curr.next=a;
            a=curr;
            curr=frw;
            count--;
        }
        pre.next=a;
        first.next=curr;
        return dummy.next;

        
    }
}