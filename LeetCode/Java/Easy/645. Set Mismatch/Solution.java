class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] ans=new int[2];
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
            if(arr[j]!=j+1) {
                ans[0]=arr[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
}