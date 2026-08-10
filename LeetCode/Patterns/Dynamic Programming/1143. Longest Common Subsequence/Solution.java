class Solution {
    public int length(String s1,String s2,int i,int j){
        if(i<0 || j<0) return 0;
        if(s1.charAt(i)==s2.charAt(j)) return 1+length(s1,s2,i-1,j-1);
        else return Math.max(length(s1,s2,i-1,j),length(s1,s2,i,j-1));
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int i=s1.length()-1;
        int j=s2.length()-1;
        return length(s1,s2,i,j);
    }
}