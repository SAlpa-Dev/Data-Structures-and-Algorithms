class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]arr=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        double median=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                arr[k++]=nums2[j++];
            }
            else{
                arr[k++]=nums1[i++];
            }
        }
        while(i<nums1.length){
            arr[k++]=nums1[i++];
        }
        while(j<nums2.length){
            arr[k++]=nums2[j++];
        }
        int length=arr.length;
        if(length%2==0){
            k=length/2;
            int n1=arr[k-1];
            int n2=arr[k];
            median=(double)(n1+n2)/2;
            return median;
        }
        else{
            k=length/2;
            median=arr[k];
            return median;
        }
    }
}