class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int[]ans=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int count=0;
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
                count++;
            }
            if(st.size()==0) ans[i]=count;
            else ans[i]=count+1;
            st.push(arr[i]);
        }
        return ans;
    }
} 