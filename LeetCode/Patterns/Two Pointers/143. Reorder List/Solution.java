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
    public void reorderList(ListNode head) {
        if(head.next==null) return;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right=slow.next;
        slow.next=null;
        ListNode right_half=reverse(right);
        ListNode i=head;
        ListNode j=right_half;
        ListNode t=i;
        while(i!=null && j!=null){
            t.next=j;
            t=t.next;
            i=i.next;

            t.next=i;
            t=t.next;
            j=j.next;
        }

        while(i!=null){
            t.next=i;
            t=t.next;
            i=i.next;
        }
        
        t.next=null;
    }
}