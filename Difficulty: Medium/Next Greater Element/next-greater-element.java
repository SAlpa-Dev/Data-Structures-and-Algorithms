class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        int i=arr.length-1;
        while(i>=0){
            if(st.size()==0) ans.add(-1);
            else if(arr[i]<st.peek()) ans.add(st.peek());
            else{
                while(st.size()>0 && arr[i]>=st.peek()) st.pop();
                if(st.size()!=0) ans.add(st.peek());
                else ans.add(-1);
            }

            st.push(arr[i]);

            i--;
        }

        Collections.reverse(ans);
        return ans;
    }
}