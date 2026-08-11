class Solution {
    public int minimum(String s1,String s2,int i,int j){
        if(i<0 || j<0) return 0;
        int replace=Integer.MAX_VALUE;int delete=Integer.MAX_VALUE;int insert=Integer.MAX_VALUE;
        if(s1.charAt(i)==s2.charAt(j)) return minimum(s1,s2,i-1,j-1);
        else{
            StringBuilder sb1=new StringBuilder(s1);
            sb1.setCharAt(i,s2.charAt(j));
            replace=1+minimum(sb1.toString(),s2,i-1,j-1);

            StringBuilder sb2=new StringBuilder(s1);
            sb2.deleteCharAt(i);
            replace=1+minimum(sb2.toString(),s2,i-1,j);

            StringBuilder sb3=new StringBuilder(s1);
            sb3.insert(i,s2.charAt(j));
            replace=1+minimum(sb3.toString(),s2,i,j-1);
            
        }
        return Math.min(replace,Math.min(delete,insert));
    }
    public int minDistance(String s1, String s2) {
        int i=s1.length()-1,j=s2.length()-1;
        return minimum(s1,s2,i,j);
    }
}