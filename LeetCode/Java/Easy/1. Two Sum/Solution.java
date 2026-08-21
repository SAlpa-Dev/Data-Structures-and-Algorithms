class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=target-arr[i];
            if(map.containsKey(rem)){
                ans[0]=map.get(rem);
                ans[1]=i;
            }
            else map.put(arr[i],i);
        }
        return ans;
    }
}