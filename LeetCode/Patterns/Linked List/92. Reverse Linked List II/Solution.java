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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode c=head;
        ListNode p=null;
        ListNode f=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode t1=dummy;
        for(int i=1;i<left;i++) t1=t1.next;
        ListNode first_node=t1.next;
        t1.next=null;
        ListNode t2=first_node;
        for(int i=left;i<right;i++) t2=t2.next;
        ListNode right_half=t2.next;
        t2.next=null;
        ListNode reversed=reverse(first_node);
        t1.next=reversed;
        ListNode temp=reversed;
        while(temp.next!=null) temp=temp.next;
        temp.next=right_half;

        return dummy.next;
    }
}