class Solution {
    public boolean isPowerOfTwo(int n){
        return ((n & (n-1))==0);
    }
    public boolean isSquare(int n){
        long root=(long)Math.sqrt(n);
        return (root*root==n);
    }
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        return isPowerOfTwo(n) && isSquare(n);
    }
}