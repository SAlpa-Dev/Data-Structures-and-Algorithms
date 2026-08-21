class Solution {
    public int findDuplicate(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            if(set.contains(val)) ans=val;
            else set.add(val);
        }
        return ans;
        
    }
}