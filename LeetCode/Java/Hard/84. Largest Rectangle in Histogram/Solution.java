class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer>st=new Stack<>();
        //finding NSE
        int[] nse=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];
            while(st.size()>0 && arr[st.peek()]>=val) st.pop();
            if(st.size()==0) nse[i]=arr.length;
            else nse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        //finding PSE
        int[] pse=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            while(st.size()>0 && arr[st.peek()]>=val) st.pop();
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }

        //finding 
        int max_area=0;
        int i=0;
        while(i<nse.length && i<pse.length){
            int area=arr[i]*(nse[i]-pse[i]-1);
            if(area>max_area) max_area=area;
            i++;
        }
        return max_area;
    }
}