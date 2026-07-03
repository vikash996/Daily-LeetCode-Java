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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        int group = 1;
        while (curr != null) {
            int cnt = 0;
            ListNode temp = curr;
            while (temp != null && cnt < group) {
                temp = temp.next;
                cnt++;
            }
            if (cnt % 2 == 0) {
                ListNode prevNode = temp;
                ListNode node = curr;
                while (cnt-- > 0) {
                    ListNode next = node.next;
                    node.next = prevNode;
                    prevNode = node;
                    node = next;
                }
                ListNode oldHead = curr;
                prev.next = prevNode;
                prev = oldHead;
                curr = temp;
            } else {
                while (cnt-- > 0) {
                    prev = curr;
                    curr = curr.next;
                }
            }
            group++;
        }
        return dummy.next;
    }
}