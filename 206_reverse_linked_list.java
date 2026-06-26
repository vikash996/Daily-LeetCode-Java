class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev=null;
        ListNode frw = null;
        while(curr!=null){
            frw = curr.next;
            curr.next=prev;
            prev=curr;
            curr=frw;
        }
        return prev;
    }    
}