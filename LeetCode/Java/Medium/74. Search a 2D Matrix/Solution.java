class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=arr.length,col=arr[0].length;
        
        int i=0,j=row*col-1;

        while(i<=j){
            int mid=i+(j-i)/2;

            int mid_row=mid/col,mid_col=mid%col;

            if(arr[mid_row][mid_col]==target){
                return true;
            }
            else if (arr[mid_row][mid_col]>target) {
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return false;
    }
}