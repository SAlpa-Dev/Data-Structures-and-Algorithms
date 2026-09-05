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
    public ListNode deleteMiddle(ListNode head) {
        int size=0;
        ListNode temp=head;
        if(temp.next==null) return null;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        for(int i=0;i<size/2-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}