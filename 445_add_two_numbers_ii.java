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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode prev1=null;
        ListNode prev2=null;
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        ListNode frw1=null;
        ListNode frw2=null;
        while(curr1!=null){
            frw1=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=frw1;
        }
        while(curr2!=null){
            frw2=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=frw2;
        }
        int carry = 0;
        ListNode temp = new ListNode(-1);
        ListNode tail=temp;
        
        curr1 = prev1;
        curr2 = prev2;
        while(curr1 != null || curr2 != null || carry != 0){
            int sum=carry;
            if(curr1 != null){
            sum += curr1.val;
            curr1 = curr1.next;
            }
            if(curr2 != null){
            sum += curr2.val;
            curr2 = curr2.next;
        }
        carry = sum / 10;
        tail.next = new ListNode(sum % 10);
        tail = tail.next;
        }
        ListNode prev = null;
        ListNode curr = temp.next;
        ListNode frw = null;

        while (curr != null) {
            frw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frw;
        }

        return prev;
    }
}