
class Solution {
    Node deleteNode(Node head, int key) {
        Node temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=null;
        if(head.data==key){
            head=head.next;
            temp.next=head;
            return head;
        }
        
        
        Node t1=head;
        Node t2=head.next;
        while(t2!=null){
            if(t2.data==key){
                t1.next=t2.next;
                if(t2==temp) t1.next=head;
            }
            t1=t1.next;
            t2=t2.next;
        }
        
        temp.next=head;
        return head;
    }
}