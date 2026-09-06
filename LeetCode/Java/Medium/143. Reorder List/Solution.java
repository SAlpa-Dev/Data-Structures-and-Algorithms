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
    public ListNode reverse(ListNode half){
        ListNode c=half;
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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode half=slow.next;
        slow.next=null;
        half=reverse(half);
        ListNode t1=head;
        ListNode t2=half;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        while(t1!=null & t2!=null){
            t.next=t1;
            t=t1;
            t1=t1.next;
            t.next=t2;
            t=t2;
            t2=t2.next;
        }
        while(t1!=null){
            t.next=t1;
            t=t1;
            t1=t1.next;
        }
        t.next=null;
    }
}