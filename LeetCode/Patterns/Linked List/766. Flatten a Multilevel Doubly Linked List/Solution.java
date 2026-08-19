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
        if(head==null) return null;
        Node temp=head;
        while(temp!=null){
            if(temp.child!=null){
                Node right=temp.next;
                Node c=flatten(temp.child);
                temp.child=null;
                temp.next=c;
                c.prev=temp;
                Node d=c;
                while(d.next!=null) d=d.next;
                d.next=right;
                if(right!=null) right.prev=d;
                temp=right;
            }
            else temp=temp.next;
        }
        return head;
    }
}