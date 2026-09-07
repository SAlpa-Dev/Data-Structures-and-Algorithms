class Solution {
    public Node deepCopy(Node head){
        Node dummy=new Node(-1);
        Node t=dummy;
        Node temp=head;
        while(temp!=null){
            Node newNode =new Node(temp.val);
            t.next=newNode;
            t=t.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public Node join(Node head,Node clone){
        Node dummy=new Node(-1);
        Node t=dummy;
        Node t1=head;
        Node t2=clone;
        while(t1!=null){
            t.next=t1;
            t=t.next;
            t1=t1.next;

            t.next=t2;
            t=t.next;
            t2=t2.next;
        }
        return dummy.next;
    }
    public void assign(Node head){
        Node t1=head;
        while(t1!=null){
            Node t2=t1.next;
            if(t1.random==null) t2.random=null;
            else t2.random=t1.random.next;
            t1=t1.next.next;
        }
    }
    public Node spilt(Node head){
        Node dummy1=new Node(-1);
        Node dummy2=new Node(-1);
        Node t1=dummy1;
        Node t2=dummy2;
        Node t=head;
        while(t!=null){
            t1.next=t;
            t1=t1.next;
            t=t.next;

            t2.next=t;
            t2=t2.next;
            t=t.next;
        }
        t1.next=null;
        t2.next=null;
        return dummy2.next;
    }

    public Node copyRandomList(Node head){
        if(head==null) return null;
        //step1: DeepCopy
        Node clone=deepCopy(head);

        //Step2: Atlernatively connect both LL
        Node connect=join(head,clone);

        //step3: Assign random pointer
        assign(connect);

        //Step4: Spilt the list
        Node ans=spilt(connect);

        return ans;

    }
}