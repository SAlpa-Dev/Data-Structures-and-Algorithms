class Solution {
    public int minimumCoin(int[] coins,int amount,int[][] dp,int i){
       if(amount==0) return 0;
       if(i>=coins.length) return Integer.MAX_VALUE;
       if(dp[i][amount]!=-1) return dp[i][amount];
       int pick=Integer.MAX_VALUE;
       if(amount>=coins[i]){
        int res=minimumCoin(coins,amount-coins[i],dp,i);
        if(res!=Integer.MAX_VALUE) pick=1+res;
       }
       int skip=minimumCoin(coins,amount,dp,i+1);
       int ans=Math.min(pick,skip);
       dp[i][amount]=ans;
       return ans;
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[]ele:dp) Arrays.fill(ele,-1);
        int result=minimumCoin(coins,amount,dp,0);
        if(result==Integer.MAX_VALUE) return -1;
        return result;
    }
}