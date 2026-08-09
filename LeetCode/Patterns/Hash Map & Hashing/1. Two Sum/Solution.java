class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]ans=new int[2];
        for(int i=0;i<arr.length;i++){
            int rem=target-arr[i];
            if(map.containsKey(rem)) {
                ans[0]=map.get(rem);
                ans[1]=i;
            }
            else map.put(arr[i],i);
        }
        return ans;
    }
}