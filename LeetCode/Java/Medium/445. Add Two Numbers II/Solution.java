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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first=reverse(l1);
        ListNode second=reverse(l2);
        ListNode t1=first;
        ListNode t2=second;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        int carry=0;
        while(t1!=null || t2!=null || carry!=0){
            int a=(t1!=null) ? t1.val:0;
            int b=(t2!=null) ? t2.val:0;
            int sum=a+b+carry;
            if(sum>9){
                ListNode newNode=new ListNode(sum%10);
                t.next=newNode;
                carry=1;
            }
            else{
                ListNode newNode=new ListNode(sum);
                t.next=newNode;
                carry=0;
            }
            t=t.next;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
        }
        ListNode ans=reverse(dummy.next);
        return ans;
    }
}