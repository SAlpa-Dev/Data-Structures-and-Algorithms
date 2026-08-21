class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[n-1];
    }
}