class Solution {
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reverse(st);
        push(top,st);
        
    }
    public static void push(int ele,Stack<Integer> st){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top=st.pop();
        push(ele,st);
        st.push(top);
    }
    
    public static void reverseStack(Stack<Integer> st) {
        reverse(st);
    }
}
