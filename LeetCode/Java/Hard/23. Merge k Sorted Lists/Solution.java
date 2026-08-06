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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0) return null;
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node:lists){
          if(node!=null) pq.add(node);
        }
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        while(pq.size()!=0){
            ListNode temp=pq.remove();
            t.next=temp;
            t=t.next;
          
            if(temp.next!=null) pq.add(temp.next);
        }
        return dummy.next;
    }
}