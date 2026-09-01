class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        if(m==1 || n==1) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        return dp[m][n]=uniquePaths(m-1,n) +uniquePaths(m,n-1); 
    }
}