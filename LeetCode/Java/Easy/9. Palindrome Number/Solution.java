class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int ans=0;
        int res=x;
        while(x!=0){
            ans=ans*10+x%10;
            x=x/10;
        }
        
        if(ans==res) return true;
        else return false;
    }
}