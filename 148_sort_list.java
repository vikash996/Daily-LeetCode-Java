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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
       
        ListNode curr = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev=null;
        while(fast!=null && fast.next !=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode left = head;
        ListNode right = slow;
        prev.next=null;
        left=sortList(left);
        right=sortList(right);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
            
        }else{
            temp.next=right;
            
        }
        return dummy.next;

        
    }
}