class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length; int n=nums2.length;
        int[] merge=new int[m+n];
        int k=0;
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                merge[k++]=nums2[j++];
            }
            else merge[k++]=nums1[i++];
        }
        while(i<m)  merge[k++]=nums1[i++];
        while(j<n)  merge[k++]=nums2[j++];
        
        int len=merge.length;
        double median=0;

        if(len%2==0){
            int mid=len/2;
            int a=merge[mid];
            int b=merge[mid-1];
            median=(double)(a+b)/2;
        }
        else{
            int mid=len/2;
            median =merge[mid];
        }
        return median;
    }
}