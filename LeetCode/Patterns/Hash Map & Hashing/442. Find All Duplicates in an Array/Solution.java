class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer>ans=new ArrayList<>();
        int n=arr.length-1;
        int i=0;
        while(i<arr.length){
            int correct_idx=arr[i]-1;
            if(arr[i]==i+1 || arr[i]==arr[correct_idx]) i++;
            else{
                int temp=arr[i]-1;
                arr[i]=arr[temp];
                arr[temp]=temp+1;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1) ans.add(arr[i]);
        }
        return ans;
    }
}