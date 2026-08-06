class Solution {
    public boolean reciprocal(char top, char ch){
        if(top=='(' && ch==')') return true;
        else if(top=='[' && ch==']') return true;
        else if(top=='{' && ch=='}') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.size()==0) return false;
                if(reciprocal(st.peek(),ch)) st.pop();
                else return false; 
            }
            i++;
        }
        if(st.size()==0) return true;
        return false;
    }
}