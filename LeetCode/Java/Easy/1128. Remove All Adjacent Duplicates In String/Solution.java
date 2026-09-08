class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==1) return s;
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(st.size()==0 || st.peek()!=ch) st.push(ch);
            else st.pop();
            i++;
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        
        String s1=ans.reverse().toString();
        return s1;
    }
}