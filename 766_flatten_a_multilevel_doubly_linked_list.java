/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        Node curr=head;
        while(curr!=null){
            if(curr.child==null) curr=curr.next;
            else{
                Node frw = curr.next;
                Node ch = flatten(curr.child);
                curr.child = null;
                curr.next=ch;
                ch.prev = curr;
                Node temp = ch;
                while(temp.next!=null) temp=temp.next;
                temp.next=frw;
                if(frw!=null) frw.prev = temp;
                curr=frw;
            }
        }
        return head;
        
    }
}