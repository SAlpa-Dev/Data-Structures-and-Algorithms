class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                    i=j;
                    sum=0;
                }
            }
        }
        return count;
    }
}