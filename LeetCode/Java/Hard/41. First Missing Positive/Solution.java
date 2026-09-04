class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i+1 || arr[i]>n || arr[i]<=0 || arr[i]==arr[arr[i]-1]) i++;
            else{
                int temp=arr[i]-1;
                arr[i]=arr[temp];
                arr[temp]=temp+1;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1) return j+1;
        }
        return n+1;
    }
}