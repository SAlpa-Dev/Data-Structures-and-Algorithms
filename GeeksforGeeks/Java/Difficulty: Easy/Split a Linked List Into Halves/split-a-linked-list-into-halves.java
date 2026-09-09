/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public Pair<Node, Node> splitList(Node head) {
        Node temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=null;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node right=slow.next;
        slow.next=head;
        Node r=right;
        while(r.next!=null) r=r.next;
        r.next=right;
        return new Pair<>(head,right);
    }
}