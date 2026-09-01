class Solution {
    public int matrixScore(int[][] grid) {

        //Step:1
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]==0){
                for(int j=0;j<grid[0].length;j++){
                    grid[i][j]^=1;
                }
            }

        }

        //Step2:
        for(int j=1;j<grid[0].length;j++){
            int count_zeros=0,count_ones=0;
            for(int i=0;i<grid.length;i++){
                if(grid[i][j]==0) count_zeros++;
                else count_ones++;
            }
            if(count_zeros>count_ones){
                for(int i=0;i<grid.length;i++){
                    grid[i][j]^=1;
                }
            }
        }

        int sum=0;
        int pow=1;
        for(int j=grid[0].length-1;j>=0;j--){
            int count_ones=0;
            for(int i=0;i<grid.length;i++){
                if(grid[i][j]==1) count_ones++;
            }

            sum+=pow*count_ones;
            pow*=2;
        }
        return sum;

    }
}