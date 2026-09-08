class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int[] ans=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--) st.push(arr[i]);
        int i=arr.length-1;
        while(i>=0){
            if(st.size()==0) ans[i]=-1;
            else if(arr[i]<st.peek()) ans[i]=st.peek();
            else{
                while(st.size()>0 && arr[i]>=st.peek()) st.pop();
                if(st.size()!=0) ans[i]=st.peek();
                else ans[i]=-1;
            }
            st.push(arr[i]);
            i--;
        }
        
        return ans;
    }
}