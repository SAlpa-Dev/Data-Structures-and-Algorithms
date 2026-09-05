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
    public int length(ListNode head){
        ListNode temp=head;
        int len=0;
        while(temp!=null) {
            temp=temp.next;
            len++;
        }
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n=length(head);
        k=k%n;
        if(k==0) return head;
        ListNode slow=head;
        ListNode fast=head;
            for(int i=0;i<k;i++) fast=fast.next;
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            ListNode rotate=slow.next;
            slow.next=null;
            fast.next=head;
            return rotate;
    }
}