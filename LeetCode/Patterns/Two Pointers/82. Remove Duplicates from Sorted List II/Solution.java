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
        ListNode i=head;
        ListNode j=head;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        if(head==null) return null;
        while(i!=null && i.next!=null){
            if(i.val!=i.next.val){
                t.next=i;
                t=i;
                i=i.next;
            }
            else{
                j=i;
                while(j!=null && j.val==i.val) j=j.next;
                i=j;
            }
        }
        t.next=i;
        return dummy.next;
    }
}