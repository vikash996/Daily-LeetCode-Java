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
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            boolean found=false;
            for(int i=0; i<nums.length; i++){
                if(nums[i]==temp.val){
                found=true;
                break;
            }
            
            }
            boolean nextFound = false;

            if(temp.next != null){
                for(int i=0; i<nums.length; i++){
                    if(nums[i] == temp.next.val){
                        nextFound = true;
                        break;
                     }
                }
            }
            if(found && (temp.next == null || !nextFound)){
                count++;
            }
            temp=temp.next;
        }
        return count;
    }
}