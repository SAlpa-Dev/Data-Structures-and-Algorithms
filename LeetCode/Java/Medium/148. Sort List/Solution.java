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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right=slow.next;
        slow.next=null;
        ListNode temp=head;
        ListNode left_half=sortList(temp);
        ListNode right_half=sortList(right);
        ListNode ans=mergeTwoLists(left_half,right_half);
        return ans;
    }
}