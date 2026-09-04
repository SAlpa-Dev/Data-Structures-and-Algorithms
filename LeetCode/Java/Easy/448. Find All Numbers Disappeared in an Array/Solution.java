class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        int i=0;
        while(i<n){
            int correct_idx=arr[i]-1;
            if(arr[i]==arr[correct_idx]) i++;
            else{
                int temp=arr[i];
                arr[i]=arr[correct_idx];
                arr[correct_idx]=temp;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1) ans.add(j+1);
        }
        return ans;
    }
}

