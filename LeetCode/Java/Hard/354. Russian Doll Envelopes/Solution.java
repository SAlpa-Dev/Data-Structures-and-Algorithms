class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });

        int[] ans=new int[envelopes.length];
        int size = 0;
        for (int[] ele:envelopes) {
            int height=ele[1];

            int i=0;
            int j=size;
            while(i<j) {
                int mid=i+(j-i)/2;
                if(ans[mid]<height) i=mid+1;
                else j=mid;
            }

            ans[i]=height;
            if(i==size) size++;
        }

        return size;
    }
}