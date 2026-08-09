class Solution {
    public void rotate(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j>i) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        for (int row=0;row<arr.length;row++) {
            int i=0,j=arr[0].length-1;
            while(i<j){
                int temp=arr[row][i];
                arr[row][i]=arr[row][j];
                arr[row][j]=temp;
                i++;
                j--;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}