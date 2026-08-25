class Solution {
    public String reverseWords(String s) {
        int i=0,j=0;
        String ans="";
        while(j<s.length()){
            if(s.charAt(j)==' '){
                StringBuilder sb=new StringBuilder(s.substring(i,j));
                sb.reverse();
                sb.append(" ");
                ans+=sb.toString();
                j++;
                i=j;
            }
            else j++;
        }
        StringBuilder sb=new StringBuilder(s.substring(i,j));
        sb.reverse();
        ans+=sb.toString();

        return ans;
    }
}