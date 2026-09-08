class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>(); 
        int i=nums2.length-1;
        while(i>=0){
            if(st.size()==0) map.put(nums2[i],-1);
            else if(nums2[i]<st.peek()) map.put(nums2[i],st.peek());
            else{
                while(st.size()>0 && nums2[i]>=st.peek()) st.pop();
                if(st.size()!=0) map.put(nums2[i],st.peek());
                else map.put(nums2[i],-1);
            }
            st.push(nums2[i]);
            i--;
        }

        for(int j=0;j<nums1.length;j++){
            if(map.containsKey(nums1[j])) ans[j]=map.get(nums1[j]);
        }

        return ans;
    }
}