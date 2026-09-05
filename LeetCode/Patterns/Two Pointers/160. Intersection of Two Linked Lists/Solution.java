/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        int sizeA=0,sizeB=0;
        while(t1!=null){
            t1=t1.next;
            sizeA++;
        }
        while(t2!=null){
            t2=t2.next;
            sizeB++;
        }

        t1=headA;
        t2=headB;
        
        if(sizeA>=sizeB){
            int diff=sizeA-sizeB;
            for(int i=0;i<diff;i++) t1=t1.next;
        }
        else{
            int diff=sizeB-sizeA;
            for(int i=0;i<diff;i++) t2=t2.next;
        }

        while(t1!=t2){
            if(t1==null || t2==null) return null;
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
}