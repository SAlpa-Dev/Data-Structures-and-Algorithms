class Solution {
    public int minimumCoin(int[] coins,int amount,int i){
       if(amount==0) return 0;
       if(i>=coins.length) return Integer.MAX_VALUE;
       int pick=Integer.MAX_VALUE;
       if(amount>=coins[i]){
        int res=minimumCoin(coins,amount-coins[i],i);
        if(res!=Integer.MAX_VALUE) pick=1+res;
       }
       int skip=minimumCoin(coins,amount,i+1);
       int ans=Math.min(pick,skip);
       return ans;
    }
    public int coinChange(int[] coins, int amount) {
        int result=minimumCoin(coins,amount,0);
        if(result==Integer.MAX_VALUE) return -1;
        return result;
    }
}