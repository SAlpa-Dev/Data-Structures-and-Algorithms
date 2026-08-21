class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int ele:nums){
            if(ele>max) max=ele;
            if(ele<min) min=ele;
        }
        HashSet<Integer>set=new HashSet<>();
        for(int ele:nums) set.add(ele);
        for(int i=min;i<=max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}