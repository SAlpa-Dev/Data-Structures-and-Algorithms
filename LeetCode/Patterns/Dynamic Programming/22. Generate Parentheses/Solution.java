class Solution {
    public void generate(int n,String s,List<String>ans,int left,int right){
        if(right==n){
            ans.add(s);
            return;
        }
        if(left<n) generate(n,s+"(",ans,left+1,right);
        if(right<left) generate(n,s+")",ans,left,right+1);
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        generate(n,"",ans,0,0);
        return ans;

    }
}