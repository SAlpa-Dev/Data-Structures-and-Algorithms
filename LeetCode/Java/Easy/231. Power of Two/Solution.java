class Solution {
    public int check(int n){
        if(n%2==0) return 0;
        if(n%2!=0) return 1;
        int ans=check(n/2);
        return ans;
    }
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        if(n==1) return true;
        int val=check(n);
        if(val%2==0) return true;
        return false;
    }
}