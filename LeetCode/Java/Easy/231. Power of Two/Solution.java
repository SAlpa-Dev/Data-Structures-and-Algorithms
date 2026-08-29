class Solution {
    public boolean isPowerOfTwo(int n) {
        /*if(n==0) return false;
        if(n==1) return true;
        if(n%2!=0) return false;
        return isPowerOfTwo(n/2);
        */

        int count=0;
        for(int i=0;i<31;i++){
            if((n>>i)%2!=0) count++;  
        }

        if(count>1) return false;
        return true;
    }
}