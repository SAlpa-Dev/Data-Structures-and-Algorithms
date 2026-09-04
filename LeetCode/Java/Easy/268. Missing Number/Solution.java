class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            int correct_idx=arr[i];
            if(arr[i]==n || arr[i]==arr[correct_idx]) i++;
            else{
                int temp=arr[i];
                arr[i]=arr[correct_idx];
                arr[correct_idx]=temp;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j) return j;
        }
        return n;
    }
}