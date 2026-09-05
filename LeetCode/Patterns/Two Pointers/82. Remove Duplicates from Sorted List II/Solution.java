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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode i=head;
        ListNode j=head;
        ListNode dummy=new ListNode(-1);
        ListNode t1=dummy;
        while(i!=null && i.next!=null){
            if(i.val==i.next.val){
                j=i;
                while(j!=null && i.val==j.val) j=j.next;
                i=j;
            }
            else{
                t1.next=i;
                t1=t1.next;
                i=i.next;
            }
        }
        t1.next=i;
        return dummy.next;
    }
}