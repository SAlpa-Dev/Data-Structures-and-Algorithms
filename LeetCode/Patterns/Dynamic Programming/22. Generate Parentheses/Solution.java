class Solution {
    public static void generate(int n,int left,int right,String ans,ArrayList<String>al){
        if(right==n){
            al.add(ans);
            return;
        }
        if(left<n) generate(n,left+1,right,ans+"(",al);
        if(right<left) generate(n,left,right+1,ans+")",al);
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String>al=new ArrayList<>();
        generate(n,0,0,"",al);
        return al;
    }
}