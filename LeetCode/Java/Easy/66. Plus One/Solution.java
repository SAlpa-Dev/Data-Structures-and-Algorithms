class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer>ans=new ArrayList<>();
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i]+carry;
            if(sum<10){
                ans.add(sum);
                carry=0;
            }
            else{
                ans.add(0);
                carry=1;
            }
        }
        if(carry==1) ans.add(carry);
        int n=ans.size();
        int[] arr=new int[n];
        int idx=0;
        for(int i=n-1;i>=0;i--){
            arr[idx++]=ans.get(i);
        }
        return arr;
    }
}