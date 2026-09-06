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
        ListNode temp1=dummy;
        for(int i=1;i<left;i++) temp1=temp1.next;
        ListNode middle1=temp1.next;
        temp1.next=null;
        ListNode temp2=middle1;
        for(int i=left;i<right;i++) temp2=temp2.next;
        ListNode right_half=temp2.next;
        temp2.next=null;
        ListNode rpart=reverse(middle1);

        temp1.next=rpart;
        ListNode t=rpart;
        while(t.next!=null) t=t.next;
        t.next=right_half;
        return dummy.next;
    }
}