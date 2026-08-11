class Solution {
    public int minimum(StringBuilder s1,StringBuilder s2,int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=minimum(s1,s2,i-1,j-1,dp);
        int replace=1+minimum(s1,s2,i-1,j-1,dp);
        int delete=1+minimum(s1,s2,i-1,j,dp);
        int insert=1+minimum(s1,s2,i,j-1,dp);
        return dp[i][j]=Math.min(replace,Math.min(delete,insert));
    }
    public int minDistance(String s1, String s2) {
        int[][] dp=new int[s1.length()][s2.length()];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        int i=s1.length()-1,j=s2.length()-1;
        return minimum(new StringBuilder(s1),new StringBuilder(s2),i,j,dp);
    }
}