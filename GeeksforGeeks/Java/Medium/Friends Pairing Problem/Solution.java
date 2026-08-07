class Solution {
    public int friends(int n,int[] dp){
        if(n==1 || n==2) return n;
        if(dp[n]!=-1) return dp[n];
        int first=friends(n-1,dp);           //first coice
        int second=(n-1)*friends(n-2,dp);     //second choice
        int ans=first+second;
        dp[n]=ans;
        return ans;
    }
    public int countFriendsPairings(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return friends(n,dp);
    }
}
