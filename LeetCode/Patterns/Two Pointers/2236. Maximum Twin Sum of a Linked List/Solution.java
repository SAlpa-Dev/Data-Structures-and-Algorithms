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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode half=slow.next;
        slow.next=null;
        ListNode c=half;
        ListNode f=null;
        ListNode p=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        ListNode t2=p;
        ListNode t1=head;
        int max=0;

        while(t1!=null && t2!=null){
            int sum=t1.val+t2.val;
            if(sum>max) max=sum;
            t1=t1.next;
            t2=t2.next;
        }
        return max;
    }
}