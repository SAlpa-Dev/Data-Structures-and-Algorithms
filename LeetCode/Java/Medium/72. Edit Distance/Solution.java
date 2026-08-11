class Solution {
    public int minimum(StringBuilder s1,StringBuilder s2,int i,int j){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(s1.charAt(i)==s2.charAt(j)) return minimum(s1,s2,i-1,j-1);
        int replace=1+minimum(s1,s2,i-1,j-1);
        int delete=1+minimum(s1,s2,i-1,j);
        int insert=1+minimum(s1,s2,i,j-1);
        return Math.min(replace,Math.min(delete,insert));
    }
    public int minDistance(String s1, String s2) {
        int i=s1.length()-1,j=s2.length()-1;
        return minimum(new StringBuilder(s1),new StringBuilder(s2),i,j);
    }
}