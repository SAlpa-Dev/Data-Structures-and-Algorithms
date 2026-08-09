class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<arr.length){
            int correct_idx=arr[i]-1;
            if(arr[i]==i+1 || arr[i]>n || arr[i]<=0 ||arr[i]==arr[correct_idx]) i++;
            else{
                int temp=arr[i]-1;
                arr[i]=arr[temp];
                arr[temp]=temp+1;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}