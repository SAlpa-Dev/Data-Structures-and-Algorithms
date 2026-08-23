class Solution {
    public int search(int[] arr, int target) {
        int i=0,j=arr.length-1;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                idx=mid;
                break;
            }
            else if(arr[i]>arr[mid]){                             //right-half sorted
                if(arr[i]<=target && target<arr[j]) i=mid+1;
                else j=mid-1;
            }
            else{                                                //left-half sorted
                if(arr[i]<=target && target<arr[mid]) j=mid-1;
                else i=mid+1; 
            }
        }

        return idx;
    }
}