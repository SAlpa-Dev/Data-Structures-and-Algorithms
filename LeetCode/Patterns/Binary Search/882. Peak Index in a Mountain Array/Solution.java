class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int idx=0;
        int i=0,j=arr.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]>arr[mid+1]){
                idx=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return idx;
    }
}