class Solution {
    public int value(int W,int[] val,int[] wt,int[][] dp,int i){
        if(i>=val.length) return 0;
        if(dp[i][W]!=-1) return dp[i][W];
        int pick=0;
        if(W>=wt[i]) pick=val[i]+ value(W-wt[i],val,wt,dp,i+1);
        int skip=value(W,val,wt,dp,i+1);
        int ans=Math.max(pick,skip);
        dp[i][W]=ans;
        return ans;
    }
    public int knapsack(int W, int val[], int wt[]) {
        int[][] dp=new int[val.length][W+1];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return value(W,val,wt,dp,0);
    }
}
