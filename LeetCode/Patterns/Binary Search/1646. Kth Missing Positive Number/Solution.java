class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int correct_idx=arr[mid]-1;
            int missing_ele=correct_idx-mid;
            if(missing_ele>=k) j=mid-1;
            else i=mid+1;
        }
        return i+k;
    }
}