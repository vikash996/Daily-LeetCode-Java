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
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr=head;
        ListNode pre = null;
        ListNode frw = null;
        while(curr!=null){
            frw=curr.next;
            curr.next=pre;
            pre=curr;
            curr=frw;
        }
        head = pre;
        int max = head.val;
        ListNode prev = head;
        ListNode value = head.next;
        while(value!=null){
            if(value.val>=max){
                max=value.val;
                prev=value;
                value=value.next;
            }else{
                prev.next = value.next;
                value = value.next;
            }
        }
        ListNode curr1=head;
        ListNode pre1 = null;
        ListNode frw1 = null; 
        while(curr1!=null){
            frw1=curr1.next;
            curr1.next=pre1;
            pre1=curr1;
            curr1=frw1;
        }  
        return pre1;

        
    }
}