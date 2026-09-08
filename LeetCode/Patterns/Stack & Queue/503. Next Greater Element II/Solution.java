class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--) st.push(arr[i]);
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];
            while(st.size()>0 && val>=st.peek()) st.pop();
            if(st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(val);
        }
        return ans;
    }
}