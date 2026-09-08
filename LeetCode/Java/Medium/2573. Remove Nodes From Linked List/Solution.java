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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            int n=temp.val;
            if(st.size()==0 || st.peek()>n) st.push(n);
            else{
                while(st.size()>0 && n>st.peek()) st.pop();
                st.push(n);
            }
            temp=temp.next;
        }
        while(!st.isEmpty()){
            ListNode newNode =new ListNode(st.pop());
            newNode.next=temp;
            temp=newNode;
        }
        return temp;

    }
}