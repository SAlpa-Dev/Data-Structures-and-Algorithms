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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        ListNode t1=list1;
        ListNode t2=list2;
        
        while(t1!=null && t2!=null){
            if(t1.val>=t2.val){
                t.next=t2;
                t=t.next;
                t2=t2.next;
            }
            else{
                t.next=t1;
                t=t.next;
                t1=t1.next;
            }
        }
        while(t1!=null){
            t.next=t1;
            t=t.next;
            t1=t1.next;
        }
        while(t2!=null){
            t.next=t2;
            t=t.next;
            t2=t2.next;
        }

        return dummy.next;
    }
}