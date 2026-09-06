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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode t=head;
        while(t!=null && t.next!=null){
            int temp=t.next.val;
            t.next.val=t.val;
            t.val=temp;
            t=t.next.next;
        }
        return head;
    }
}