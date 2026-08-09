class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character>set=new HashSet<>();
       int i=0,j=0;
       int maxlength=0;
       while(j<s.length()){
            char ch=s.charAt(j);
            if(set.contains(ch)){
                int len=j-i;
                maxlength=Math.max(maxlength,len);
                while(set.contains(ch)){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(ch);
                j++;
            }
            else{
                set.add(ch);
                j++;
            }
       }
        int len=j-i;
        maxlength=Math.max(maxlength,len);
        return maxlength;
    }
}