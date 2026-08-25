class Solution {
    public int compress(char[] chars) {
        if(chars.length==1) return 1;
        int idx=0;
        for(int i=0;i<chars.length;i++){
            int grp_len=1;
            char ch=chars[i];
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                grp_len++;
                i++;
            }
            chars[idx++]=ch;
            if(grp_len>1){
                for(char ele:String.valueOf(grp_len).toCharArray()){
                    chars[idx++]=ele;
                }
            }
        }
        return idx;
    }
}