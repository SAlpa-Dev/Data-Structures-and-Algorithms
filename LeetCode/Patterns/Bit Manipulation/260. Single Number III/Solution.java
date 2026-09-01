class Solution {
    public int[] singleNumber(int[] nums) {
        int n=0;
        for(int ele:nums){
            n^=ele;
        }

        int mask=(n & (n-1))^n;
        int b1=0,b2=0;

        for(int ele:nums){
            if((ele & mask)==0) b1^=ele;
            else b2^=ele;  
        }

        int[] arr=new int[2];
        arr[0]=b1;
        arr[1]=b2;

        return arr;
    }
}