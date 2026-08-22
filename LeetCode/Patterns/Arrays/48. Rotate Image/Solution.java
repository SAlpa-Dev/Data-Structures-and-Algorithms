class Solution {
    public void rotate(int[][] arr) {

        //transpose
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //reverse
        for(int i=0;i<arr.length;i++){
            int j=arr[i].length-1,k=0;
            while(k<j){
                int temp=arr[i][j];
                arr[i][j--]=arr[i][k];
                arr[i][k++]=temp;
            }
        }
    }
}