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
        ListNode f=null;
        ListNode p=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode half=slow.next;
        slow.next=null;
        ListNode temp=reverse(half);
        ListNode t1=head;
        ListNode t2=temp;
        while(t1!=null && t2!=null){
            if(t1.val==t2.val){
                t1=t1.next;
                t2=t2.next;
            }
            else return false;
        }
        return true;
    }
}