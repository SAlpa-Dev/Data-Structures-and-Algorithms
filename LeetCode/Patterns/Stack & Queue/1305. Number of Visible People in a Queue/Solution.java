class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int[] ans=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        int i=arr.length-1;
        while(i>=0){
            int count=0;
            if(st.size()==0) ans[i]=count;
            else if(arr[i]<st.peek()) ans[i]=count+1;
            else{
                while(st.size()>0 && arr[i]>st.peek()){
                    count++;
                    st.pop();
                }
                if(st.size()!=0) ans[i]= count+1;
                else ans[i]=count; 
            }
            st.push(arr[i]);
            i--;
        }

        return ans;

    }
} 